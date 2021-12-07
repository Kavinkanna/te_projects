package com.tyss.thread.threadconcepts;

public class ThreadTwo extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Two"+Thread.currentThread().getName());
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
		}
	}
}
