package com.tyss.Statictype.Static;

public class NonStatic_Static {

	static int emp_id;
	static String emp_name;
	
	/*initializing static variables*/
	static {
		emp_id=100;
		emp_name="praful";
	}
	int id;
	String profile;
	String name;
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	void dispProfile() {
		System.out.println(profile);
	}

	public String getProfile() {
		return profile;
	}
	
	
	{
		id=100;
		name="rohan";
		profile="software";
	}
	
}
