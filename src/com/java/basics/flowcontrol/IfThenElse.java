package com.java.basics.flowcontrol;

public class IfThenElse {

	 public static void main(String[] args) {

		  ifStatement();
		  
		  ifWithString();
		  
		  ifThenElse();
		  
		  ifElseIf();
		  
		  nestedIf();
		  
		  }
	 
	 private static void ifStatement() {
		 int number = 10;

		    // checks if number is less than 0
		    if (number < 0) {
		      System.out.println("The number is negative.");
		    }

		    System.out.println("Statement outside if block"); 
	 }
	 
	 private static void ifWithString() {
		 String language = "Java";

		    // if statement
		    if (language == "Java") {
		      System.out.println("Best Programming Language");
		    }
	 }
	 
	 private static void ifThenElse() {
		 int number = 10;

		    // checks if number is greater than 0
		    if (number > 0) {
		      System.out.println("The number is positive.");
		    }
		    
		    // execute this block
		    // if number is not greater than 0
		    else {
		      System.out.println("The number is not positive.");
		    }

		    System.out.println("Statement outside if...else block");
		  }
	 
	 private static void ifElseIf() {
		 int number = 0;

		    // checks if number is greater than 0
		    if (number > 0) {
		      System.out.println("The number is positive.");
		    }

		    // checks if number is less than 0
		    else if (number < 0) {
		      System.out.println("The number is negative.");
		    }
		    
		    // if both condition is false
		    else {
		      System.out.println("The number is 0.");
		    }
	 }
	 
	 private static void nestedIf() {
		// declaring double type variables
		    Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

		    // checks if n1 is greater than or equal to n2
		    if (n1 >= n2) {

		      // if...else statement inside the if block
		      // checks if n1 is greater than or equal to n3
		      if (n1 >= n3) {
		        largest = n1;
		      }

		      else {
		        largest = n3;
		      }
		    } else {

		      // if..else statement inside else block
		      // checks if n2 is greater than or equal to n3
		      if (n2 >= n3) {
		        largest = n2;
		      }

		      else {
		        largest = n3;
		      }
		    }

		    System.out.println("Largest Number: " + largest);
	 }
}
