package com.tyss.threads.common;

public class ThreadsByLamda {
	public static void main(String[] args) {
		System.out.println("started");
		Runnable runnable =()->{
				for (int i = 0; i < 11; i++) {
					System.out.println(i);
				}
		};
		
		Runnable runnable2 = ()->{
			for (int i = 10; i < 20; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		Thread thread2 = new Thread(runnable2);
		
		thread.start();
		thread2.start();
		System.out.println("ended");
	}
}
