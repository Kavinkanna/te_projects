package com.tyss.thread.multithread;

public class Threads {

	public static void main(String[] args) {
		String name1 = "ABC";
		String name2 = "ABC";
		
		Thread tt1 = new Thread() {
			public void run() {  
		          synchronized (name1) {  
		           System.out.println("Thread 1: locked resource 1");  
		          
		           synchronized (name2) {  
		            System.out.println("Thread 1: locked resource 2");  
		           }  
		         }  
		      }   
		};
		
		Thread tt2 = new Thread() {
			public void run() {  
		          synchronized (name2) {  
		           System.out.println("Thread 2: locked resource 2");  
		          }
		           synchronized (name1) {  
		            System.out.println("Thread 1: locked resource 2");  
		           }  
		         
		      }   
		};
		
		tt1.start();
		tt2.start();
	}
}
