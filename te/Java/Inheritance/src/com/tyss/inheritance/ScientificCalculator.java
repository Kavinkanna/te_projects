package com.tyss.inheritance;


public class ScientificCalculator extends Calculator {

 public void square(int n) {
	 System.out.println("square of "+n+": " + n*n);
 }
 
 public void squareroot(int n) {
	double ans=  Math.sqrt(n);
	System.out.println("squareroot of "+n+": "+ans);
 }
	
}
