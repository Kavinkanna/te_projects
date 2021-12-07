package com.tyss.mapping.manytoone;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.mapping.onetoone.Employee;
import com.tyss.mapping.onetoone.Laptop;

public class TwoWay {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		Item item = new Item();
		item.setId(30);
		item.setIname("Book");
		
		Item item2 = new Item();
		item2.setId(40);
		item2.setIname("Pen");

		Cart cart = new Cart();
		cart.setCid(20);
		cart.setCname("new");
		
		item.setCart(cart);
		item2.setCart(cart);
		ArrayList<Item> arrayList = new ArrayList<Item>();
		arrayList.add(item);
		arrayList.add(item2);
		
		cart.setItems(arrayList);
		
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
//			entityTransaction.begin();
//			entityManager.persist(cart);
//			entityTransaction.commit();
			
		Cart cart2= 	entityManager.find(Cart.class, 10);
		System.out.println(cart2.getItems());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
