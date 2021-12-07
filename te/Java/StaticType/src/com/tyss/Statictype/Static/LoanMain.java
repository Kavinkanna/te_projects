package com.tyss.Statictype.Static;

public class LoanMain {

	public static void main(String[] args) {
		
		Loan L=new Loan();
		
		System.out.println(L.calcintrestamount());
		System.out.println(L.calctotalamount());
		L.printStaticroi();
		
		
		
		Loan L1=new Loan();
		System.out.println(L1.calcintrestamount());
		System.out.println(L1.calctotalamount());
		L1.printStaticroi();
		L.printStaticroi();
		System.out.println(L.intrestamount);
		
		
	}

}
