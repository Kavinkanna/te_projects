package com.tyss.mapping.manytoone;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.mapping.onetoone.Employee;
import com.tyss.mapping.onetoone.Laptop;

public class OneWay {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		Item item = new Item();
		item.setId(20);
		item.setIname("Key");

		Cart cart = new Cart();
		cart.setCid(10);
		cart.setCname("first");
		
		item.setCart(cart);
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(item);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
