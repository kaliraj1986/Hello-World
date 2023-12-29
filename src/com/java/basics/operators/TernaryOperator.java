package com.java.basics.operators;

import java.util.Scanner;

/**
 * In Java, a ternary operator can be used to replace the if...else statement in certain situations. 
 	Its syntax is:

	condition ? expression1 : expression2;
	
	Here, condition is evaluated and
	
	if condition is true, expression1 is executed. 	And, if condition is false, expression2 is executed.
	The ternary operator takes 3 operands (condition, expression1, and expression2). Hence, the name ternary operator.
 *
 */
public class TernaryOperator {

	 public static void main(String[] args) {
		    
		    // take input from users
		    Scanner input = new Scanner(System.in);
		    System.out.println("Enter your marks: ");
		    double marks = input.nextDouble();

		    // ternary operator checks if
		    // marks is greater than 40
		    String result = (marks > 40) ? "pass" : "fail";

		    System.out.println("You " + result + " the exam.");
		    input.close();
		    
		    /**
		     * Note: 
		     * It is not recommended to use nested ternary operators. This is because it makes our code more complex.
		     */
		    
		 // create a variable
		    int n1 = 2, n2 = 9, n3 = -11;

		    // nested ternary operator
		    // to find the largest number
		    int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
		    System.out.println("Largest Number: " + largest);
		  }
}
