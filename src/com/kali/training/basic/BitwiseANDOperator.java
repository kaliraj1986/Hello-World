package com.kali.training.basic;

public class BitwiseANDOperator {
	/**
	 * The bitwise AND & operator returns 1 if and only if both the operands are 1. Otherwise, it returns 0.
	 
	12 = 00001100 (In Binary)
			25 = 00011001 (In Binary)

			// Bitwise AND Operation of 12 and 25
			   00001100
			 & 00011001
			____________
			   00001000 = 8 (In Decimal)

	*/
	public static void main(String[] args) {

	    int number1 = 12, number2 = 25, result;

	    // bitwise AND between 12 and 25
	    result = number1 & number2;
	    System.out.println(result);    // prints 8
	  }
}
