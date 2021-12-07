package com.tyss.custome_exception.customeuncheckedexception;

public class Election {


	public void vote(int age) {
			
		if (age <18) {
			 throw new AgeValidator("Invalid Age");
		}else {
			System.out.println("successfully casted Vote");
		}
	}
}
