package com.tyss.thread.threadconcepts;

public class Test {
	public static void main(String[] args) {
		System.out.println(" App Started");
		System.out.println(Thread.currentThread().getName()  );
		ThreadOne one = new ThreadOne();
		ThreadTwo two = new ThreadTwo();
		
		one.start();
		two.start();
		System.out.println("App ended");
	}
}
