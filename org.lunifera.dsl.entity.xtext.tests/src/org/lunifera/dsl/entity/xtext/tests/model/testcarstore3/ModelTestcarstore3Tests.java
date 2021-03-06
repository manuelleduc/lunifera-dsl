/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.dsl.entity.xtext.tests.model.testcarstore3;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.lunifera.dsl.entity.xtext.tests.AbstractJPATest;

public class ModelTestcarstore3Tests extends AbstractJPATest {

	private static final String PERSISTENCE_UNIT_NAME = "testcarstore3";
	private static EntityManagerFactory emf;

	@Before
	public void setUp() throws Exception {
		super.setUp();

		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME,
				properties);

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		txn.begin();
		Car c = em.find(Car.class, 2L);
		assertNull(c);

		try {
			Query q = em.createNativeQuery("create schema SCHEMA3");
			q.executeUpdate();
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
		}

		txn = em.getTransaction();
		Manufacturer manufacturer = new Manufacturer();
		Car car = new Car();

		manufacturer.setName("Lunifera Racecars");
		car.setConstructiondate(new Date(2012, 4, 4));
		car.setModelname("Beta Romeo");
		car.setManufacturer(manufacturer);

		txn.begin();
		em.persist(manufacturer);
		txn.commit();

	}

	@After
	public void tearDown() throws Exception {
		emf.close();
	}

	/**
	 * Delete cascade operation
	 */
	@Test
	public void test1() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();

		Manufacturer m = em.find(Manufacturer.class, 1L);
		Car c = em.find(Car.class, 2L);
		assertNotNull(c);
		em.remove(m);
		txn.commit();

		txn.begin();
		c = em.find(Car.class, 2L);
		assertNull(c);
		txn.rollback();
	}

	// /**
	// * Delete cascade operation
	// */
	// @Test
	// public void test2() {
	// EntityManager em = emf.createEntityManager();
	// EntityTransaction txn = em.getTransaction();
	// txn.begin();
	//
	// Car c = em.find(Car.class, 2L);
	// assertNotNull(c);
	// try {
	// Query query = em.createQuery("delete from Manufacturer m");
	// query.executeUpdate();
	// fail("JPA does not support CASCADE DELETE on database level for default.");
	// } catch (Exception e) {
	// }
	// txn.rollback();
	// }

}
