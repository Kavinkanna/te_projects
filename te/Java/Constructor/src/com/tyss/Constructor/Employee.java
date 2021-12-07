package com.tyss.Constructor;

 public class Employee {
	 
	 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int emp_id, String email) {
		super();
		this.emp_id = emp_id;
		this.email = email;
	}


	public Employee(String name,int emp_id) {
		super();
		this.emp_id = emp_id;
		this.name = name;
	}


	public Employee(int emp_id, String name, String email) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.email = email;
	}




	int emp_id;
	String name;
	String email;
	
	
}
