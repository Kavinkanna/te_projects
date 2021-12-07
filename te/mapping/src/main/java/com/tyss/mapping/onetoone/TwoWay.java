package com.tyss.mapping.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.service.spi.Manageable;

public class TwoWay {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		Employee employee = new Employee();
		employee.setEid(20);
		employee.setEname("Keerti");
		
		Laptop laptop = new Laptop();
		
		laptop.setSid(3);
		laptop.setSname("Dell");
		
		employee.setLaptop(laptop);
		laptop.setEmployee(employee);
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
//			entityManager.persist(laptop);
			Laptop lp = entityManager.find(Laptop.class,3 );
			System.out.println(laptop.getEmployee().getEname());
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
