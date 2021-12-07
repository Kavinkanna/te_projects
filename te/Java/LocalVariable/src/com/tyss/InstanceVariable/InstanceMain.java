package com.tyss.InstanceVariable;

public class InstanceMain {

	public static void main(String[] args) {
		Instance In=new Instance();
		System.out.println(In.englishMarks);
		System.out.println(In.mathMarks);
		System.out.println(In.scienceMarks);
		System.out.println(In.name);
		System.out.println(In.perc);
		System.out.println(In.agre);
		In.agre=57.8;
		In.englishMarks=36;
		In.mathMarks=40;
		In.name="rohan";
		In.perc=59.2f;
		In.scienceMarks=34;
		
		System.out.println(In.englishMarks);
		System.out.println(In.mathMarks);
		System.out.println(In.scienceMarks);
		System.out.println(In.name);
		System.out.println(In.perc);
		System.out.println(In.agre);
		
		
		Instance on=new Instance();
		on=In;
		System.out.println(on.englishMarks);
		
		
	}

}
