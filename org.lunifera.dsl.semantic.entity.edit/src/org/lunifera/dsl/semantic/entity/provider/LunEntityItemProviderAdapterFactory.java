/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 *  All rights reserved. This program and the accompanying materials 
 *  are made available under the terms of the Eclipse Public License v1.0 
 *  which accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html 
 * 
 *  Based on ideas from Xtext, Xtend, Xcore
 *    
 *  Contributors:  
 *  		Florian Pirchner - Initial implementation 
 *  
 */
package org.lunifera.dsl.semantic.entity.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.lunifera.dsl.semantic.common.types.LFeature;
import org.lunifera.dsl.semantic.common.types.LType;
import org.lunifera.dsl.semantic.common.types.LTypedPackage;
import org.lunifera.dsl.semantic.common.types.LunTypesPackage;
import org.lunifera.dsl.semantic.common.types.util.LunTypesSwitch;
import org.lunifera.dsl.semantic.entity.LunEntityFactory;
import org.lunifera.dsl.semantic.entity.util.LunEntityAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LunEntityItemProviderAdapterFactory extends LunEntityAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LunEntityItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LEntityModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEntityModelItemProvider lEntityModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LEntityModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLEntityModelAdapter() {
		if (lEntityModelItemProvider == null) {
			lEntityModelItemProvider = new LEntityModelItemProvider(this);
		}

		return lEntityModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LBean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LBeanItemProvider lBeanItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LBean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLBeanAdapter() {
		if (lBeanItemProvider == null) {
			lBeanItemProvider = new LBeanItemProvider(this);
		}

		return lBeanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LEntity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEntityItemProvider lEntityItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLEntityAdapter() {
		if (lEntityItemProvider == null) {
			lEntityItemProvider = new LEntityItemProvider(this);
		}

		return lEntityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LEntityPersistenceInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEntityPersistenceInfoItemProvider lEntityPersistenceInfoItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LEntityPersistenceInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLEntityPersistenceInfoAdapter() {
		if (lEntityPersistenceInfoItemProvider == null) {
			lEntityPersistenceInfoItemProvider = new LEntityPersistenceInfoItemProvider(this);
		}

		return lEntityPersistenceInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LEntityColumnPersistenceInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEntityColumnPersistenceInfoItemProvider lEntityColumnPersistenceInfoItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LEntityColumnPersistenceInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLEntityColumnPersistenceInfoAdapter() {
		if (lEntityColumnPersistenceInfoItemProvider == null) {
			lEntityColumnPersistenceInfoItemProvider = new LEntityColumnPersistenceInfoItemProvider(this);
		}

		return lEntityColumnPersistenceInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LTablePerClassStrategy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LTablePerClassStrategyItemProvider lTablePerClassStrategyItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LTablePerClassStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLTablePerClassStrategyAdapter() {
		if (lTablePerClassStrategyItemProvider == null) {
			lTablePerClassStrategyItemProvider = new LTablePerClassStrategyItemProvider(this);
		}

		return lTablePerClassStrategyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LTablePerSubclassStrategy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LTablePerSubclassStrategyItemProvider lTablePerSubclassStrategyItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LTablePerSubclassStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLTablePerSubclassStrategyAdapter() {
		if (lTablePerSubclassStrategyItemProvider == null) {
			lTablePerSubclassStrategyItemProvider = new LTablePerSubclassStrategyItemProvider(this);
		}

		return lTablePerSubclassStrategyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LEntityFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEntityFeatureItemProvider lEntityFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LEntityFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLEntityFeatureAdapter() {
		if (lEntityFeatureItemProvider == null) {
			lEntityFeatureItemProvider = new LEntityFeatureItemProvider(this);
		}

		return lEntityFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LEntityAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEntityAttributeItemProvider lEntityAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LEntityAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLEntityAttributeAdapter() {
		if (lEntityAttributeItemProvider == null) {
			lEntityAttributeItemProvider = new LEntityAttributeItemProvider(this);
		}

		return lEntityAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LEntityReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEntityReferenceItemProvider lEntityReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LEntityReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLEntityReferenceAdapter() {
		if (lEntityReferenceItemProvider == null) {
			lEntityReferenceItemProvider = new LEntityReferenceItemProvider(this);
		}

		return lEntityReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LBeanFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LBeanFeatureItemProvider lBeanFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LBeanFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLBeanFeatureAdapter() {
		if (lBeanFeatureItemProvider == null) {
			lBeanFeatureItemProvider = new LBeanFeatureItemProvider(this);
		}

		return lBeanFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LBeanAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LBeanAttributeItemProvider lBeanAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LBeanAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLBeanAttributeAdapter() {
		if (lBeanAttributeItemProvider == null) {
			lBeanAttributeItemProvider = new LBeanAttributeItemProvider(this);
		}

		return lBeanAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LBeanReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LBeanReferenceItemProvider lBeanReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LBeanReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLBeanReferenceAdapter() {
		if (lBeanReferenceItemProvider == null) {
			lBeanReferenceItemProvider = new LBeanReferenceItemProvider(this);
		}

		return lBeanReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LBeanToEntityReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LBeanToEntityReferenceItemProvider lBeanToEntityReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LBeanToEntityReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLBeanToEntityReferenceAdapter() {
		if (lBeanToEntityReferenceItemProvider == null) {
			lBeanToEntityReferenceItemProvider = new LBeanToEntityReferenceItemProvider(this);
		}

		return lBeanToEntityReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LIndex} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LIndexItemProvider lIndexItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LIndex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLIndexAdapter() {
		if (lIndexItemProvider == null) {
			lIndexItemProvider = new LIndexItemProvider(this);
		}

		return lIndexItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.lunifera.dsl.semantic.entity.LOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LOperationItemProvider lOperationItemProvider;

	/**
	 * This creates an adapter for a {@link org.lunifera.dsl.semantic.entity.LOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLOperationAdapter() {
		if (lOperationItemProvider == null) {
			lOperationItemProvider = new LOperationItemProvider(this);
		}

		return lOperationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (lEntityModelItemProvider != null) lEntityModelItemProvider.dispose();
		if (lBeanItemProvider != null) lBeanItemProvider.dispose();
		if (lEntityItemProvider != null) lEntityItemProvider.dispose();
		if (lEntityPersistenceInfoItemProvider != null) lEntityPersistenceInfoItemProvider.dispose();
		if (lEntityColumnPersistenceInfoItemProvider != null) lEntityColumnPersistenceInfoItemProvider.dispose();
		if (lTablePerClassStrategyItemProvider != null) lTablePerClassStrategyItemProvider.dispose();
		if (lTablePerSubclassStrategyItemProvider != null) lTablePerSubclassStrategyItemProvider.dispose();
		if (lEntityFeatureItemProvider != null) lEntityFeatureItemProvider.dispose();
		if (lEntityAttributeItemProvider != null) lEntityAttributeItemProvider.dispose();
		if (lEntityReferenceItemProvider != null) lEntityReferenceItemProvider.dispose();
		if (lBeanFeatureItemProvider != null) lBeanFeatureItemProvider.dispose();
		if (lBeanAttributeItemProvider != null) lBeanAttributeItemProvider.dispose();
		if (lBeanReferenceItemProvider != null) lBeanReferenceItemProvider.dispose();
		if (lBeanToEntityReferenceItemProvider != null) lBeanToEntityReferenceItemProvider.dispose();
		if (lIndexItemProvider != null) lIndexItemProvider.dispose();
		if (lOperationItemProvider != null) lOperationItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link LunTypesPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class LunTypesChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends LunTypesSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseLTypedPackage(LTypedPackage object) {
				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LTYPED_PACKAGE__TYPES,
						 LunEntityFactory.eINSTANCE.createLBean()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LTYPED_PACKAGE__TYPES,
						 LunEntityFactory.eINSTANCE.createLEntity()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseLType(LType object) {
				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LTYPE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLBean()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LTYPE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLEntity()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LTYPE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLEntityFeature()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LTYPE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLEntityAttribute()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LTYPE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLEntityReference()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LTYPE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLBeanFeature()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LTYPE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLBeanAttribute()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LTYPE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLBeanReference()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LTYPE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLBeanToEntityReference()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LTYPE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLOperation()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseLFeature(LFeature object) {
				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LFEATURE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLBean()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LFEATURE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLEntity()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LFEATURE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLEntityFeature()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LFEATURE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLEntityAttribute()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LFEATURE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLEntityReference()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LFEATURE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLBeanFeature()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LFEATURE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLBeanAttribute()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LFEATURE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLBeanReference()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LFEATURE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLBeanToEntityReference()));

				newChildDescriptors.add
					(createChildParameter
						(LunTypesPackage.Literals.LFEATURE__ANNOTATION_INFO,
						 LunEntityFactory.eINSTANCE.createLOperation()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return EntityEditPlugin.INSTANCE;
		}
	}

}
