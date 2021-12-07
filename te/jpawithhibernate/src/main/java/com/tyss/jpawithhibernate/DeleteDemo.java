package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Person;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityTransaction transaction = null;
		EntityManager manager = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Person person = manager.find(Person.class,999);
			manager.remove(person);
			transaction.commit();
			System.out.println("Record Deleted");
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
	}// End Of The Main
}// End Of The Class
