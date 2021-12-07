package com.tyss.day1.basics;

public class Comparision {

	public static void main(String[] args) {
		String s="abc";
		String q="abc";
		String n=new String("abc");
		if(s==q) {
			System.out.println("s and q both are equal");
		}
		
		if(s==n) {
			System.out.println("both are equal");
		}else {
			System.out.println("s and n are not equal");
		}
		
		
		char a='a';
		char b='b';
		System.out.println(a>b);//false
		
		String v="abc";
		String l="abc";
		System.out.println(v==l);//true
		
		
		System.out.println(10>20);//false
		/*we can use comparison opertor's on all datatype's except boolean*/
		//System.out.println(10>20>30);
		
		char an='a';
		System.out.println(an==97);//true
		
		//concatination
		
		String s1="ram";
		String s2="mandir";
		System.out.println(s1+s2);//rammandir
		
		System.out.println(10+20);//30 + is overloaded operator
		
		System.out.println(s1.concat(s2));//rammandir
		
		//logical operators
		System.out.println(4&5);//4
		System.out.println(4|5);//5
		System.out.println(4^5);//1
		
		System.out.println(4);//-5
		System.out.println(3);//-4
		
		System.out.println();
		
		

	}

}
