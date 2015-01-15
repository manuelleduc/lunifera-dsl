package org.lunifera.dsl.xtext.lazyresolver;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.util.internal.Stopwatches;
import org.eclipse.xtext.util.internal.Stopwatches.StoppedTask;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelCompleter;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.lunifera.dsl.xtext.lazyresolver.api.DerivedRootAdapter;
import org.lunifera.dsl.xtext.lazyresolver.api.IIndexDerivedStateComputer;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class IndexDerivedStateComputer extends JvmModelAssociator implements
		IIndexDerivedStateComputer {

	// private final static Logger LOG =
	// Logger.getLogger(IndexDerivedStateComputer.class);

	@Inject
	private Provider<IJvmModelInferrer> inferrerProvider;

	@Inject
	private JvmModelCompleter completer;

	public void setCompleter(JvmModelCompleter completer) {
		this.completer = completer;
	}

	/**
	 * @since 2.8
	 * @noreference This method is not intended to be referenced by clients
	 */
	public void setInferrerProvider(Provider<IJvmModelInferrer> inferrerProvider) {
		this.inferrerProvider = inferrerProvider;
	}

	@SuppressWarnings("restriction")
	public void installDerivedState(final DerivedStateAwareResource resource,
			boolean preIndexingPhase) {
		if (resource.getContents().isEmpty())
			return;

		EObject eObject = resource.getContents().get(0);

		StoppedTask task = Stopwatches
				.forTask("JVM Model inference (JvmModelAssociator.installDerivedState)");
		task.start();
		JvmDeclaredTypeAcceptor acceptor = new JvmDeclaredTypeAcceptor(resource);
		try {
			IJvmModelInferrer inferrer = inferrerProvider.get();
			if (inferrer instanceof IndexModelInferrer) {
				((IndexModelInferrer) inferrer).setContext(resource);
			}
			inferrer.infer(eObject, acceptor, preIndexingPhase);
		} catch (RuntimeException e) {
			// LOG.error("Error calling inferrer", e);
		}
		// if (!preIndexingPhase) {
		// for (Pair<JvmDeclaredType, Procedure1<? super JvmDeclaredType>>
		// initializer : acceptor.later) {
		// try {
		// initializer.getValue().apply(initializer.getKey());
		// } catch (RuntimeException e) {
		// // LOG.error("Error calling inferrer", e);
		// }
		// }
		// }
		task.stop();

		// if (!preIndexingPhase) {
		// for (EObject object : resource.getContents()) {
		// if (object instanceof JvmIdentifiableElement) {
		// JvmIdentifiableElement element = (JvmIdentifiableElement) object;
		// completer.complete(element);
		// }
		// }
		// }
	}

	@SuppressWarnings("restriction")
	@Override
	public void installDerivedState(DerivedStateAwareResource resource,
			int index, boolean preIndexingPhase) {
		if (resource.getContents().isEmpty())
			return;

		JvmDeclaredType derivedOne = (JvmDeclaredType) resource.getContents()
				.get(index);
		DerivedRootAdapter derivedRootAdapter = (DerivedRootAdapter) EcoreUtil
				.getAdapter(derivedOne.eAdapters(), DerivedRootAdapter.class);
		EObject derivedSemantic = derivedRootAdapter.getSemantic();

		StoppedTask task = Stopwatches
				.forTask("JVM Model inference (JvmModelAssociator.installDerivedState)");
		task.start();
		JvmDeclaredTypeAcceptor acceptor = new JvmDeclaredTypeAcceptor(resource);
		try {
			IndexModelInferrer inferrer = (IndexModelInferrer) inferrerProvider
					.get();
			if (inferrer instanceof IndexModelInferrer) {
				((IndexModelInferrer) inferrer).setContext(resource);
			}
			inferrer.inferForLater(derivedOne, derivedSemantic, acceptor,
					preIndexingPhase, derivedRootAdapter.getSelector());
		} catch (RuntimeException e) {
			// LOG.error("Error calling inferrer", e);
			System.out.println(e);
		}
		if (!preIndexingPhase) {
			for (Pair<JvmDeclaredType, Procedure1<? super JvmDeclaredType>> initializer : acceptor.later) {
				try {
					initializer.getValue().apply(initializer.getKey());
				} catch (RuntimeException e) {
					// LOG.error("Error calling inferrer", e);
					System.out.println(e);
				}
			}
		}
		task.stop();

		if (!preIndexingPhase) {
			completer.complete(derivedOne);
		}
	}

}
