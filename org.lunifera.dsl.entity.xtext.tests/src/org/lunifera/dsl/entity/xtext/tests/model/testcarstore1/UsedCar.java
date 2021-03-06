package org.lunifera.dsl.entity.xtext.tests.model.testcarstore1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.lunifera.dsl.entity.xtext.tests.model.testcarstore1.Car;
import org.lunifera.dsl.entity.xtext.tests.model.testcarstore1.Customer;

@Entity
@Table(name = "USED_CAR")
@DiscriminatorValue(value = "USED_CAR")
@SuppressWarnings("all")
public class UsedCar extends Car {
  @Column(name = "STATE")
  private String state;
  
  @Column(name = "MILEAGE")
  private int mileage;
  
  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "SELLER", nullable = false)
  private Customer seller;
  
  /**
   * Checks whether the object is disposed.
   * @throws RuntimeException if the object is disposed.
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
   * If this object keeps composition containments, these will be disposed too. 
   * So the whole composition containment tree will be disposed on calling this method.
   */
  public void dispose() {
    if (isDisposed()) {
      return;
    }
    super.dispose();
  }
  
  /**
   * Returns the state property or <code>null</code> if not present.
   */
  public String getState() {
    checkDisposed();
    return this.state;
  }
  
  /**
   * Sets the state property to this instance.
   */
  public void setState(final String state) {
    checkDisposed();
    this.state = state;
  }
  
  /**
   * Returns the mileage property or <code>null</code> if not present.
   */
  public int getMileage() {
    checkDisposed();
    return this.mileage;
  }
  
  /**
   * Sets the mileage property to this instance.
   */
  public void setMileage(final int mileage) {
    checkDisposed();
    this.mileage = mileage;
  }
  
  /**
   * Returns the <em>required</em> seller property.
   */
  public Customer getSeller() {
    checkDisposed();
    return this.seller;
  }
  
  /**
   * Sets the seller property to this instance.
   */
  public void setSeller(final Customer seller) {
    checkDisposed();
    this.seller = seller;
  }
}
