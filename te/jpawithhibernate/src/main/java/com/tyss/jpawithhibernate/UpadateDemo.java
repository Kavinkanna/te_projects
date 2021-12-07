package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Person;

public class UpadateDemo {

	public static void main(String[] args) {
		EntityTransaction transaction=null;
		EntityManager manager=null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Person record=manager.find(Person.class,999);
			record.setName("Rock");
			transaction.commit();
			System.out.println("Record Updated");
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		manager.close();

	}// End Of The Method

}// End Of The Clss

