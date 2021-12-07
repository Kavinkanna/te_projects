package com.tyss.Constructor;

public class EmployeeMainCons {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.emp_id=101;
		e1.email="rohancjadhav4@gmail.com";
		e1.name="rohan";
		
		Employee e2=new Employee(102,"prafulcjadhav4@gmail.com","praful");
		Employee e3=new Employee(103,"pranavcjadhav4@gmail.com","pranav");
		
		
		System.out.println(e1.emp_id+" "+e1.name+" "+e1.email);
		System.out.println(e2.emp_id+" "+e2.name+" "+e2.email);
		System.out.println(e3.emp_id+" "+e3.name+" "+e3.email);
	}

}
