package com.tyss.custome_exception.customeuncheckedexception;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Age");
			String age = scanner.next();

			int finalAge = Integer.parseInt(age);

			Election election = new Election();
			election.vote(finalAge);
		} catch (AgeValidator e) {
			System.out.println(e.getMessage());
		}
	}
}
