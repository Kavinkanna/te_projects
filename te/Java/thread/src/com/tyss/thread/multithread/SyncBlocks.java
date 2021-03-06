package com.tyss.thread.multithread;

public class SyncBlocks {
	public static void main(String[] args) {
		
		MainClass tables = new MainClass();

		Runnable ref1 = () -> {
			synchronized (tables) {
				tables.printTable(2);
			}
		};

		Runnable ref2 = () -> {
			synchronized(tables) {
				tables.printTable(5);
			}
		};

		Thread threadOne = new Thread(ref1);
		Thread threadTwo = new Thread(ref2);

		threadOne.start();
		threadTwo.start();
	}
}
