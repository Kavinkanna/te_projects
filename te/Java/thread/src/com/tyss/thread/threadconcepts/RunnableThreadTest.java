package com.tyss.thread.threadconcepts;

public class RunnableThreadTest {
	public static void main(String[] args) {
			
		RunnableThreadOne one = new RunnableThreadOne();
		RunnableThreadTwo two = new RunnableThreadTwo();
		
		Thread threadOne = new Thread(one);
		Thread threadTwo = new Thread(two);
		
		threadOne.start();
		threadTwo.start();
	}
}
