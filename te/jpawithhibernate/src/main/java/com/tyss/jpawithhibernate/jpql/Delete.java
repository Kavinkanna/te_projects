package com.tyss.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpawithhibernate.dto.Person;

public class Delete {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager manager = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		try {
			manager = factory.createEntityManager();
			String jpql = "delete from Person p where p.id =:pid";
			transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager.createQuery(jpql);
			query.setParameter("pid",2);
			int record = query.executeUpdate();
			transaction.commit();
			if (record!=0) 
				System.out.println("Record Deleted" + record);
			else
			System.out.println("Record Deleted" + record);
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
	}// End Of The Main
}// End Of The Class
