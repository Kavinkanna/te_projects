package com.tyss.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpawithhibernate.dto.Person;

public class GetAll {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select p from Person p where p.id=1";
		Query query = manager.createQuery(jpql);
		Person person=(Person) query.getSingleResult();
		/*List<Person> personList = query.getResultList();
		for (Person person : personList) {*/
			System.out.println(person.getId());
			System.out.println(person.getName());
			System.out.println(person.getMailId());
			System.out.println("==========");

		//}//End Of The Loop

	}//End Of The Main()

}//End Of The class
