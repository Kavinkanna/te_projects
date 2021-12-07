package com.tyss.thread.threadconcepts;

public class RunnableThreadTwo implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread 2" + Thread.currentThread().getName());
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
		}
		
	}

}
