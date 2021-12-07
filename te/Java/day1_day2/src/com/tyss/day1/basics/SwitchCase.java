package com.tyss.day1.basics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your lucky number to know your luck");
		a=scan.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("you are having good day");
			break;
			
		case 2:
			System.out.println("you are having best day");
			break;

		case 3:
			System.out.println("you are having better day");
			break;
			
		case 4:
			System.out.println("you are having difficult time going on");
			break;

		default:
			System.out.println("all the best");
 }

	}

}
