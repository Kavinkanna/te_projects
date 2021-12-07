package com.tyss.thread.threadconcepts;

public class ThreadOne extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread One " + Thread.currentThread().getName());
		for (int i = 0; i < 7; i++) {
			System.out.println(i);
		}
	}
}
