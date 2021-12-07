package com.tyss.overriding;

public class TestOverriding {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.bike();
		
		Parent p1=new Parent(10);
		System.out.println(p1.a);
		
		
		Child c=new Child();
		c.bike();
		
		Parent pa=new Child();
		pa.bike();
		p=c;
		
		p.bike();
		Child z=new Child();
		c.car();// only accessible by child type reference
        p=z;
     
      
	}

}
