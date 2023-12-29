package com.java.basics.flowcontrol;

/**
 
 The switch statement allows us to execute a block of code among many alternatives.

	The syntax of the switch statement in Java is:
	
	switch (expression) {
	
	  case value1:
	    // code
	    break;
	  
	  case value2:
	    // code
	    break;
	  
	  ...
	  ...
	  
	  default:
	    // default statements
	  }
	  
 * @author kalir
 *
 */
public class SwitchStatement {
	
	public static void main(String[] args) {

	    int number = 44;
	    String size;

	    // switch statement to check size
	    switch (number) {

	      case 29:
	        size = "Small";
	        break;

	      case 42:
	        size = "Medium";
	        break;

	      // match the value of week
	      case 44:
	        size = "Large";
	        break;

	      case 48:
	        size = "Extra Large";
	        break;
	      
	      default:
	        size = "Unknown";
	        break;

	    }
	    System.out.println("Size: " + size);
	  }

}
