package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Person;

public class Reattached {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager manager = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Person record = manager.find(Person.class,1);
			System.out.println(manager.contains(record));
			manager.detach(record);
			System.out.println(manager.contains(record));
			record.setName("Rahul");
			Person mergeRecord=manager.merge(record);
			mergeRecord.setName("Raju Chacha");
			transaction.commit();
			System.out.println("Record Updated");
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		manager.close();

	}

}
