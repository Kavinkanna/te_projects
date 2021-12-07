package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Person;

public class InsertDemo {
	public static void main(String[] args) {
		EntityTransaction transaction=null;
		EntityManager manager=null;
		
		Person person=new Person();
		person.setId(999);
		person.setName("David");
		person.setMailId("david@gmail.com");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(person);
			transaction.commit();
			System.out.println("Record Inserted");
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		manager.close();
		

	}// End Of The Method

}// End Of The Clss
