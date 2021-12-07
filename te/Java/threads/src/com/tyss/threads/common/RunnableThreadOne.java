package com.tyss.threads.common;

public class RunnableThreadOne implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}
	}

}
