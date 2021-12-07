package com.tyss.mapping.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.internal.CoreLogging;

import com.tyss.mapping.manytoone.Cart;

public class ManyToManyTest {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		Student student = new Student();
		student.setSid(10);
		student.setName("ABC");
		
		Student student2 = new Student();
		student2.setSid(20);
		student2.setName("ZBC");
		
		Course course = new Course();
		course.setCid(10);
		course.setName("JAVA");
		
		Course course2 = new Course();
		course2.setCid(20);
		course2.setName("Hibernate");
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student);
		students.add(student);
		
		course.setStudents(students);
		course2.setStudents(students);
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course2);
		courses.add(course);
		
		student.setCourses(courses);
		student2.setCourses(courses);
		
		
 
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
//			entityTransaction.begin();
//			entityManager.persist(student);
//			entityTransaction.commit();
		Student student3=	entityManager.find(Student.class, 10);
			System.out.println(student3.getCourses());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
