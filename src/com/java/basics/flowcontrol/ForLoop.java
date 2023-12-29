package com.java.basics.flowcontrol;

/**
	Java for loop is used to run a block of code for a certain number of times. The syntax of for loop is:

	for (initialExpression; testExpression; updateExpression) {
	    // body of the loop
	}
	Here,

	The initialExpression initializes and/or declares variables and executes only once.
	The condition is evaluated. If the condition is true, the body of the for loop is executed.
	The updateExpression updates the value of initialExpression.
	The condition is evaluated again. The process continues until the condition is false.
 */
public class ForLoop {

	public static void main(String[] args) {

		repeatStatement();
		
		printSeqNo();
		
		sumSeqNo();
		
		nestedForLoop();

	}
	
	private static void repeatStatement() {
		int n = 5;
		// for loop  
		for (int i = 1; i <= n; ++i) {
			System.out.println("Java is fun");
		}
	}

	private static void printSeqNo() {
		int n = 5;
		// for loop  
		for (int i = 1; i <= n; ++i) {
			System.out.println(i);
		}
	}

	private static void sumSeqNo() {
		int sum = 0;
		int n = 1000;

		// for loop
		for (int i = 1; i <= n; ++i) {
			// body inside for loop
			sum += i;     // sum = sum + i
		}

		System.out.println("Sum = " + sum);
	}
	
	private static void nestedForLoop() {
		int n = 15;
		// for loop  
		for (int i = 1; i <= n; ++i) {
			System.out.println("");
			
			for (int j =1 ; j < i; ++j) {
				System.out.print("*");
			}
		}
	}

}
