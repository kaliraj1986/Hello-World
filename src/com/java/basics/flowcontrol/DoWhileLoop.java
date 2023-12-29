package com.java.basics.flowcontrol;

/**
 The do...while loop is similar to while loop. However, the body of do...while loop is executed once before the test expression is checked. 
 For example,

	do {
	    // body of loop
	} while(textExpression);
 
 *
 */
public class DoWhileLoop {

	public static void main(String[] args) {

	    int i = 1, n = 5;

	    // do...while loop from 1 to 5
	    do {
	      System.out.println(i);
	      i++;
	    } while(i <= n);
	  }
}
