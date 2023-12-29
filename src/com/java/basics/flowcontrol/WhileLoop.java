package com.java.basics.flowcontrol;

import java.util.Scanner;

/**
 *  loops are used to repeat a block of code. For example, if you want to show a message 100 times, then you can use a loop. 
 *  It's just a simple example; you can achieve much more with loops
 * @author kalir
 *
 */
public class WhileLoop {

	
	public static void main(String[] args) {

	    // declare variables
	    int i = 1, n = 5;

	    // while loop from 1 to 5
	    while(i <= n) {
	      System.out.println(i);
	      i++;
	    }
	  }
	
	private static void sumPositieNos() {
		int sum = 0;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // take integer input from the user
	    System.out.println("Enter a number");
	    int number = input.nextInt();
		   
	    // while loop continues 
	    // until entered number is positive
	    while (number >= 0) {
	      // add only positive numbers
	      sum += number;

	      System.out.println("Enter a number");
	      number = input.nextInt();
	    }
		   
	    System.out.println("Sum = " + sum);
	    input.close();
	}
}
