package com.tyss.threads.common;

public class RunnableThreadTwo implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId());
		for (int i = 10; i <= 20; i++) {
			System.out.println(i);
		

		}
	}

}
