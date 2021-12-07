package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Person;
import com.tyss.jpawithhibernate.manytoone.PencilBox;
import com.tyss.jpawithhibernate.manytoone.Pencils;

public class TestManytoOne {
	public static void main(String[] args) {
	
	EntityTransaction transaction=null;
	EntityManager manager=null;
	PencilBox box=new PencilBox();
	box.setBoxid(112);
	box.setName("Apsara");
	
	Pencils pencils=new Pencils();
	pencils.setPid(13);
	pencils.setColor("Red");
	//pencils.setBox(box);

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
	try {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		
		PencilBox boxs=manager.find(PencilBox.class,112);
		pencils.setBox(boxs);
		transaction.begin();
		manager.persist(pencils);
		transaction.commit();
		System.out.println("Record Inserted");
	} catch (Exception e) {
		transaction.rollback();
		e.printStackTrace();
	}
	manager.close();
	

}// End Of The Method

}// End Of The Clss
