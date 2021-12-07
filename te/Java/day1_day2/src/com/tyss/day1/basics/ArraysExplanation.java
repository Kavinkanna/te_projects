package com.tyss.day1.basics;

import java.util.Scanner;

public class ArraysExplanation {

	public static void main(String[] args) {
		int[] arr= new int[5];
		int[] arr1= {10,20,30,40,50};
		int   []arr2=new int[5];
		int   arr3[]=new int[5];
		/*[] int arr4=new int[5];*/ //doesnt work
		/*int [] arr5=new int[5.5];*/ //doesnt work
		System.out.println(arr1[0]);
		System.out.println(arr1.length);
		
		Scanner s=new Scanner(System.in);
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
		
		
		for(int x:arr1) {
			System.out.println(x);
		}
		
		
	}

}
