package com.sarthak.java;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €*/

public class CurrencyFormatter {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        
	       
	NumberFormat localPayment; 
	        localPayment = NumberFormat.getCurrencyInstance(Locale.US);
	        System.out.println("US: " + localPayment.format(payment));         
	        localPayment = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
	        System.out.println("India: " + localPayment.format(payment));
	        localPayment = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        System.out.println("China: " + localPayment.format(payment));
	        localPayment = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        System.out.println("France: " + localPayment.format(payment));

	}

}
