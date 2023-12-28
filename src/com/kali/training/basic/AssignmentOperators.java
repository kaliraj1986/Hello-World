package com.kali.training.basic;

public class AssignmentOperators {

	public static void main(String[] args) {

		// create variables
		int a = 4;
		int var = 0;

		// assign value using =
		var = a;
		System.out.println("var using =: " + var);

		// assign value using =+
		var += a;
		System.out.println("var using +=: " + var);

		// assign value using =*
		var *= a;
		System.out.println("var using *=: " + var);
		
//		Operator	Example	Equivalent to
	//		=	a = b;	a = b;
	//		+=	a += b;	a = a + b;
	//		-=	a -= b;	a = a - b;
	//		*=	a *= b;	a = a * b;
	//		/=	a /= b;	a = a / b;
	//		%=	a %= b;	a = a % b;
	}
}
