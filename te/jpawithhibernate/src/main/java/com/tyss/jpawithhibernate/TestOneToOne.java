package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Person;
import com.tyss.jpawithhibernate.onetoone.Aadhar;
import com.tyss.jpawithhibernate.onetoone.Persons;

public class TestOneToOne {
	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager manager = null;
		Aadhar aadhar = new Aadhar();
		aadhar.setAid(11);
		aadhar.setAddress("Abc");

		Persons person = new Persons();
		person.setPid(1);
		person.setName("Sunil");
		person.setAadhar(aadhar);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			/*
			 * transaction.begin(); manager.persist(person); transaction.commit();
			 */
			
		Aadhar record=	manager.find(Aadhar.class, 11);
		record.getPerson().getPid();
		record.getPerson().getName();
		record.getAid();
		record.getAddress();
			System.out.println("Record Inserted");
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		manager.close();

	}// End Of The Method

}// End Of The Clss
