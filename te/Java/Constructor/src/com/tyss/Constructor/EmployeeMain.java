package com.tyss.Constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.emp_id=101;
		e1.email="rohancjadhav4@gmail.com";
		e1.name="rohan";
		
		Employee e2=new Employee();
		e2.emp_id=102;
		e2.email="prafulcjadhav4@gmail.com";
		e2.name="praful";
		
		System.out.println(e1.emp_id+" "+e1.name+" "+e1.email);
		System.out.println(e2.emp_id+" "+e2.name+" "+e2.email);
	}

}
