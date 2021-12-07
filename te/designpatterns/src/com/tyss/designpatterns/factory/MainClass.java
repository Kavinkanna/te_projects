package com.tyss.designpatterns.factory;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Plan Type");

		String planType = scanner.nextLine();

		GetPlan plan = new GetPlan();

		Plan planType2 = plan.getPlan(planType);

		float bill = planType2.generateBill(10);

		System.out.println(" Current Bill is " + bill);

		scanner.close();
	}
}
