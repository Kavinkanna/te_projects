package com.tyss.threads.common;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " in control");

		}

	}

}

public class ExampleYield {
	
	public static void main(String[] args) {
		MyThread myThread= new MyThread();
		MyThread myThread2 = new MyThread();
		
		new Thread(myThread).start();
		new Thread(myThread2).start();
		Thread.yield();

		 final String resource1 = "ratan jaiswal";  
		    final String resource2 = "vimal jaiswal";  
		    // t1 tries to lock resource1 then resource2  
		    Thread t1 = new Thread() {  
		      public void run() {  
		          synchronized (resource1) {  
		           System.out.println("Thread 1: locked resource 1");  
		           try {
					resource1.wait(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		           synchronized (resource2) {  
		            System.out.println("Thread 1: locked resource 2");  
		           }  
		         }  
		      }  
		    };  
		  
		    // t2 tries to lock resource2 then resource1  
		    Thread t2 = new Thread() {  
		      public void run() {  
		        synchronized (resource2) {  
		          System.out.println("Thread 2: locked resource 2");  
		          
		          synchronized (resource1) {  
		        	  
		            System.out.println("Thread 2: locked resource 1");      
		            resource2.notify();
		          }  
		        }  
		      }  
		    };  
		  
		      
		    t1.start();  
		    t2.start();  

	}
}
