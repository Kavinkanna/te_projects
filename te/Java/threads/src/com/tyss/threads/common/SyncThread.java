package com.tyss.threads.common;

public class SyncThread {
	
	public  void printTable(int n) {
		
		for (int i = 1; i < 6; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}
