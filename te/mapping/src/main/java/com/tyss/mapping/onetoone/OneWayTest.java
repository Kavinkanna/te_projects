package com.tyss.mapping.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneWayTest {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		Employee employee = new Employee();
		employee.setEid(10);
		employee.setEname("Suresh");
		
		Laptop laptop = new Laptop();
		
		laptop.setSid(10);
		laptop.setSname("HP");
		
		employee.setLaptop(laptop)
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(employee);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
