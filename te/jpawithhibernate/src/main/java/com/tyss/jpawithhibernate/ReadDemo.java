package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Person;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		EntityManager manager = factory.createEntityManager();
		Person person = manager.find(Person.class,1);
		System.out.println("Person Id " + person.getId());
		System.out.println("Person Name " + person.getName());
		System.out.println("Person Email" + person.getMailId());
		manager.close();

	}// End Of The Main

}// End Of The Class
