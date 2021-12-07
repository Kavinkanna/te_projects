package com.basics.common;

import java.util.Scanner;

public class ArrayPractice {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		readNew();
		int a[] = new int[10];
		int j = 10;
		for (int i = 0; i < a.length; i++) {
			a[i]= j++;
		}
		
		System.out.println("---------");
//		print(a);
		
		System.out.println("------------ 2nd type ---------------");
		
		int[] b = {10,20,30,40};
//		print(b);
		
		
	}
	public static void readNew() {
		System.out.println(" Enter Size ");
		int[] c = new int[scanner.nextInt()];
		System.out.println("Enter the elements");
		for (int i = 0; i < c.length; i++) {
			c[i]= scanner.nextInt();
		}
		System.out.println(" this is the array before sort");
		print(c);
		System.out.println("------------after sort-------------");
		 c = sort(c);
		print(c);
	}
	
	public static int[] sort(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size-1; i++) {
				for (int j = 0; j < size-i-1; j++) {
					if (arr[j]> arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;	
					}		
				}
		}
		System.out.println("sorted Array");
		return arr;
	}
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
