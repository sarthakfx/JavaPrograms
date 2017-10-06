package com.sarthak.java;
import java.math.BigDecimal;
import java.util.Scanner;

public class DyanamicConversion {

	public static void main(String args[]){
		
		//Scanner scan = new Scanner(System.in);
		String a ="2M";
		
		String[][] conversion = {{"K","1000"},{"M","1000000"},{"B","1000000000"}};
		
		for(int i=0;i<conversion.length;i++){
			
			if(a.endsWith(conversion[i][0])){
				
				BigDecimal temp = new BigDecimal(a.substring(0, a.indexOf(conversion[i][0])));
				
				temp.multiply(new BigDecimal(conversion[i][1]));
				a = temp.toBigInteger().toString();
				System.out.println(a);
				break;
			}
		}
		
		
		
	}
}
