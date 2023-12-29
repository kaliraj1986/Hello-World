package com.java.basics.operators;

public class BitwiseOperators {
	
	
	public static void main(String[] args) {
	 
		bitwiseAND();
		bitwiseOR();
	    printBitwiseXOR();
	    printBitwiseComplementOperation();
	    callLeftShiftOperation();
	    callSighnedRrightShiftOperation();
	    callUnSighnedRrightShiftOperation();
	  }
	
	
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
	public static void bitwiseAND() {

	    int number1 = 12, number2 = 25, result;

	    // bitwise AND between 12 and 25
	    result = number1 & number2;
	    System.out.println("Bitwise AND Result >>"+result);    // prints 8
	  }
	
	/**
	 * 		
	 *  12 = 00001100 (In Binary)
		25 = 00011001 (In Binary)

		Bitwise OR Operation of 12 and 25
		   00001100
		 | 00011001
		____________
		   00011101 = 29 (In Decimal)
		   
	 * @param args
	 */
	public static void bitwiseOR() {
	    int number1 = 12, number2 = 25, result;

	    // bitwise OR between 12 and 25
	    result = number1 | number2;
	    System.out.println("Result : Bitwise OR Operation of 12 and 25 >>"+result);    // prints 29
	  
	  }
	
	
	private static void printBitwiseXOR() {
		
		/**
		 	12 = 00001100 (In Binary)
			25 = 00011001 (In Binary)
			
			// Bitwise XOR Operation of 12 and 25
			   00001100
			 ^ 00011001
			____________
			   00010101 = 21 (In Decimal)	 
		 
		 */

	    int number1 = 12, number2 = 25, result;

	    // bitwise XOR between 12 and 25
	    result = number1 ^ number2;
	    System.out.println("Result : Bitwise XOR Operation of 12 and 25 >> "+result);    // prints 21
	  }
	
	public static void printBitwiseComplementOperation() {
		/**
		 // compute the 2's complement of 36
			36 = 00100100 (In Binary)
			
			1's complement = 11011011
			
			2's complement:
			 11011011
			    +   1
			_________
			 11011100
		 
		 */

	    int number = 35, result;

	    // bitwise complement of 35
	    result = ~number;
	    System.out.println("Result : bitwise complement of 35 >> "+result);    // prints -36
	  }
	
	/**
	 When we perform a 1 bit left shift operation on it, each individual bit is shifted to the left by 1 bit.
	As a result, the left-most bit (most-significant) is discarded and the right-most position(least-significant) 
	remains vacant. This vacancy is filled with 0s.
	 */
	private static void callLeftShiftOperation() {
	    int number = 2;
	   
	    // 2 bit left shift operation 
	    int result = number << 2;
	    System.out.println("Result: Bitwise LEFT Shift Operation:: "+result);    // prints 8
	  }
	
	
	
	/**
	 The signed right shift operator shifts all bits towards the right by a certain number of specified bits. It is denoted by >>.
	When we shift any number to the right, the least significant bits (rightmost) are discarded and the most significant position (leftmost) is filled with the sign bit. 
	For example,
	 // right shift of 8
		8 = 1000 (In Binary)
		
		// perform 2 bit right shift
		8 >> 2:
		1000 >> 2 = 0010 (equivalent to 2)
		
		
		// right shift of -8
		8 = 1000 (In Binary)
		
		1's complement = 0111
		
		2's complement:
		
		 0111
		  + 1
		_______
		 1000
		
		Signed bit = 1
		
		// perform 2 bit right shift
		8 >> 2:
		1000 >> 2 = 1110 (equivalent to -2)
	 */
	public static void callSighnedRrightShiftOperation() {
		
	    int number1 = 8;
	    int number2 = -8;
	    
	    // 2 bit signed right shift
	    System.out.println("Result| Sighned Right Shift Operation no1 >> "+(number1 >> 2));    // prints 2
	    System.out.println("Result| Sighned Right Shift Operation no2>> "+(number2 >> 2));    // prints -2
	  }
	
	
	/**
	 *Java also provides an unsigned right shift. It is denoted by >>>.

		Here, the vacant leftmost position is filled with 0 instead of the sign bit. For example,
		
		// unsigned right shift of 8
		8 = 1000
		
		8 >>> 2 = 0010
		
		// unsigned right shift of -8
		-8 = 1000 (see calculation above)
		
		-8 >>> 2 = 0010
	 */
public static void callUnSighnedRrightShiftOperation() {
		
	int number1 = 8;
    int number2 = -8;
    
    // 2 bit signed right shift
    System.out.println("Result| Unsighned Rigth Shift Operation no1:: "+(number1 >>> 2));    // prints 2
    System.out.println("Result| Unsighned Right Shift Operation no2:: "+ (number2 >>> 2));    // prints 1073741822
	  }
}
