package com.java.basics.flowcontrol;
/**
 * In Java, the for-each loop is used to iterate through elements of arrays and collections (like ArrayList). 
 * It is also known as the enhanced for loop.
 *
 */
public class forEeachLoop {

	public static void main(String[] args) {
		  
		   // an array of numbers
		   int[] numbers = {3, 4, 5, -5, 0, 12};
		   int sum = 0;

		   // iterating through each element of the array 
		   for (int number: numbers) {
			   System.out.println("No>> "+number);
		     sum += number;
		   }
		  
		   System.out.println("Sum = " + sum);
		 }
}
