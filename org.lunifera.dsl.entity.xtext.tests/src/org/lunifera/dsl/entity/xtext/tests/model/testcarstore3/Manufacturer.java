package org.lunifera.dsl.entity.xtext.tests.model.testcarstore3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(schema = "SCHEMA3", name = "MANUFACTURER")
@DiscriminatorValue(value = "MANUFACTURER")
@SuppressWarnings("all")
public class Manufacturer {
	@Transient
	private boolean disposed;

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "NAME")
	private String name;

	@OneToMany(mappedBy = "manufacturer", targetEntity = Car.class, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Car> cars;

	/**
	 * Returns true, if the object is disposed. Disposed means, that it is
	 * prepared for garbage collection and may not be used anymore. Accessing
	 * objects that are already disposed will cause runtime exceptions.
	 */
	public boolean isDisposed() {
		return this.disposed;
	}

	/**
	 * Checks whether the object is disposed.
	 * 
	 * @throws RuntimeException
	 *             if the object is disposed.
	 */
	private void checkDisposed() {
		if (isDisposed()) {
			throw new RuntimeException("Object already disposed: " + this);
		}
	}

	/**
	 * Calling dispose will destroy that instance. The internal state will be
	 * set to 'disposed' and methods of that object must not be used anymore.
	 * Each call will result in runtime exceptions.<br/>
	 * If this object keeps composition containments, these will be disposed
	 * too. So the whole composition containment tree will be disposed on
	 * calling this method.
	 */
	public void dispose() {
		if (isDisposed()) {
			return;
		}
		try {
			// Dispose all the composition references.
			if (this.cars != null) {
				for (Car car : this.cars) {
					car.dispose();
				}
				this.cars = null;
			}

		} finally {
			disposed = true;
		}

	}

	/**
	 * Returns the id property or <code>null</code> if not present.
	 */
	public long getId() {
		checkDisposed();
		return this.id;
	}

	/**
	 * Sets the id property to this instance.
	 */
	public void setId(final long id) {
		checkDisposed();
		this.id = id;
	}

	/**
	 * Returns the name property or <code>null</code> if not present.
	 */
	public String getName() {
		checkDisposed();
		return this.name;
	}

	/**
	 * Sets the name property to this instance.
	 */
	public void setName(final String name) {
		checkDisposed();
		this.name = name;
	}

	/**
	 * Returns an unmodifiable list of cars.
	 */
	public List<Car> getCars() {
		checkDisposed();
		return Collections.unmodifiableList(internalGetCars());
	}

	/**
	 * Returns the list of <code>Car</code>s thereby lazy initializing it.
	 */
	private List<Car> internalGetCars() {
		if (this.cars == null) {
			this.cars = new ArrayList<Car>();
		}
		return this.cars;
	}

	/**
	 * Adds the given car to this object.
	 * <p>
	 * Since the reference is a composition reference, the opposite reference
	 * (Car.manufacturer) of the car will be handled automatically and no
	 * further coding is required to keep them in sync. See
	 * {@link Car#setManufacturer(Car)}.
	 * 
	 */
	public void addToCars(final Car car) {
		checkDisposed();
		car.setManufacturer(this);
	}

	/**
	 * Removes the given car from this object.
	 * <p>
	 * Since the reference is a cascading reference, the opposite reference
	 * (Car.manufacturer) of the car will be handled automatically and no
	 * further coding is required to keep them in sync. See
	 * {@link Car#setManufacturer(Car)}.
	 * 
	 */
	public void removeFromCars(final Car car) {
		checkDisposed();
		car.setManufacturer(null);
	}

	void internalAddToCars(final Car car) {
		internalGetCars().add(car);
	}

	void internalRemoveFromCars(final Car car) {
		internalGetCars().remove(car);
	}
}
