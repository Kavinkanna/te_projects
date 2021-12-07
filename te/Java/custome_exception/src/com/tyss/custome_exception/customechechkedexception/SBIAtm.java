package com.tyss.custome_exception.customechechkedexception;

public class SBIAtm {

	public static void main(String[] args) {
		ATMSimulator atmSimulator = new ATMSimulator();
		try {
			atmSimulator.withDraw(1000000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
