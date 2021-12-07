package com.tyss.Statictype.Static;

public class FlowOfExecution {
	public static void main(String args[]) {
		System.out.println("inside main method");
		A a=new A();
	System.out.println(a.itsNonStaticVariable);	
	
	}

	
	
	
	
	
}	

class A{
	static int itsStaticVariable; //static variable
	int itsNonStaticVariable; //Non static variable
	static {
		itsStaticVariable=100;
		System.out.println("first static block");
		System.out.println("accessing static variable:"+itsStaticVariable);
	}
	static {
		System.out.println("static block 2");
	}
	
	static void add() {
		System.out.println("inside static method");
	}
	{
		System.out.println("inside first non static block");
		itsNonStaticVariable=1007;
		System.out.println("setted nonstatic variable through non static block"+ itsNonStaticVariable);
	}
}

