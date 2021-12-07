package com.tyss.day1.basics;

public class Loops {

	public static void main(String[] args) {
		//while loop
//print the numbers from 1 to 10
		int i=1;
		while(i<=10) {
			if(i==1) {
				System.out.print("inside while loop ");
			}
			System.out.print(i);
			i++;
		}
		System.out.println("  ");
		int j=1;
		do {
			if(j==1) {
				System.out.print("inside do while ");
			}
			System.out.print(j);
			j++;
		}while(j<=10);
		System.out.println("  ");

		int arr[]=new int[10];
		for(int z=1;z<=10;z++) {
			if(z==1) {
				System.out.print("inside for loop ");
			}
			System.out.print(arr[z-1]=z);
		}
		System.out.println("  ");

		for(int m:arr) {
			if(m==1) {System.out.print("inside foreach  ");}
			System.out.print(m);
		}
		System.out.println();
		/*for(;;) {
			System.out.println("whats happening");
		}*/
		int d=0;
		for(System.out.println("hi");d<=10;d++) {
			System.out.print(d);
		}
		
		
		
		
		

	}

}
