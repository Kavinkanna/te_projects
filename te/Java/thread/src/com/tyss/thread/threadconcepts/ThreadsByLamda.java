package com.tyss.thread.threadconcepts;

import javax.sound.midi.Soundbank;

public class ThreadsByLamda {
	public static void main(String[] args) {
		System.out.println(" Started ");
		
		Runnable ref1 = ()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		
		Runnable ref2 = ()->{
			for (int i = 10; i < 20; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(ref1);
		Thread thread2 = new Thread(ref2);
		
		thread.start();
		thread2.start();
		System.out.println("Ended");
	}
}
