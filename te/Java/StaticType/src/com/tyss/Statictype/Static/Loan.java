/* Loan
 * 
 * version 1.1
 * 
 * @copyright rohan
 */

package com.tyss.Statictype.Static;

import java.util.Scanner;

public class Loan {   /** class declaration*/
	
	private static float roi=10.0f; /*static variable*/
	
	 int principle_amount;
	int time_in_years;
	float intrestamount;   
	float totalamount;
	
	
	Scanner s=new Scanner(System.in);
	
	float  calcintrestamount() {
		System.out.println("enter the loan amount required");
		principle_amount=s.nextInt();
		System.out.print("enter the time require to repay in years");
		time_in_years=s.nextInt();
		System.out.println("enter the rate of intrest");
		roi=s.nextFloat();
		
		intrestamount=(principle_amount*time_in_years*roi)/100;
		
		return intrestamount;
		
	}
	
	float calctotalamount() {
		totalamount=principle_amount+intrestamount;
		
		return totalamount;
	}
	
	void  printStaticroi() {
		System.out.println(roi);
	}

}
