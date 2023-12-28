package com.java.basics.operators;

public class BitwiseOROperator {
	public static void main(String[] args) {
		
//		12 = 00001100 (In Binary)
//		25 = 00011001 (In Binary)
//
//		Bitwise OR Operation of 12 and 25
//		   00001100
//		 | 00011001
//		____________
//		   00011101 = 29 (In Decimal)

	    int number1 = 12, number2 = 25, result;

	    // bitwise OR between 12 and 25
	    result = number1 | number2;
	    System.out.println(result);    // prints 29
	  }
	
	
}
