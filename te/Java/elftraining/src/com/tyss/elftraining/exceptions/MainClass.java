package com.tyss.elftraining.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class MainClass {

	public void readFile() throws Exception {
		FileInputStream fileInputStream = new FileInputStream("src/emo.txt");
		int i = fileInputStream.read();
		
		while( i != -1) {
			char data = (char) i;
			System.out.print(data);
			i = fileInputStream.read();
		}
		fileInputStream.close();

	}
	
	public void printData(){
		String string = null;
		System.out.println(string.charAt(0));
	}
}
