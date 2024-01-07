package com.java.basics;

public class StringClass {

	public static void main(String args[]){      
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.'};      
		String helloString = new String(helloArray);
		System.out.println( helloString );

	}

	private static void stringConstructor() {
		//		Creating an empty string:
		String s = new String();
		//			Creating a string from another string:
		String s2 = new String("Hello, world!");
		//		Creating a string from a byte array:
		byte[] bytes = "Hello, world!".getBytes();
		String s3 = new String(bytes);

		//			Creating a string from a character array:
		char[] chars = "Hello, world!".toCharArray();
		String s4 = new String(chars);	

		//		Creating a string from a StringBuffer:
		StringBuffer buffer = new StringBuffer("Hello, world!");
		String s6 = new String(buffer);

		//			Creating a string from a StringBuilder:
		StringBuilder builder = new StringBuilder("Hello, world!");
		String s7 = new String(builder);


	}

	/**
	 * indexOf(): - Used to find the index of a character or substring within a string. 
	 */
	private static void indexOf() {
		String str = "banana";
		int index = str.indexOf('a');
		System.out.println(index); // 1
	}

	/**
	 * lastIndexOf(): - Used to find the last index of a character or substring within a string. 
	 * For example, 
	 * the following code will return the last index of the occurrence of the character 'a' in the string "banana":
	 */
	private static void lastIndexOf() {
		String str = "banana";
		int index = str.lastIndexOf('a');
		System.out.println(index); // 3
	}

	/**
	 * length(): - Used to get the length of a string. 
	 * For example, the following code will return the length of the string "banana":
	 */
	private static void length() {
		String str = "banana";
		int length = str.length();
		System.out.println(length); // 6
	}

	/**
	 * charAt(): - Used to get the character at a specified index within a string. 
	 * For example, the following code will return the character at index 2 in the string "banana":
	 */
	private static void charAt() {
		String str = "banana";
		char c = str.charAt(2);
		System.out.println(c); // n
	}

	/**
	 * concat(): - Used to concatenate two strings together. 
	 * For example, the following code will concatenate the strings "banana" and "split" together:
	 */
	private static void concat() {
		String str1 = "banana";
		String str2 = "split";
		String str3 = str1.concat(str2);
		System.out.println(str3); // bananasplit
	}

	/**
	 * contains(): - Used to check if a string contains a specified substring. 
	 * For example, the following code will check if the string "banana" contains the substring "ana":

	 */
	private static void contains() {
		String str = "banana";
		boolean contains = str.contains("ana");
		System.out.println(contains); // true
	}

	private static void startsWith() {
		String str = "banana";
		boolean startsWith = str.startsWith("ba");
		boolean endsWith = str.startsWith("ba", 1);
		System.out.println(endsWith); // true
	}

	/**
	 * endsWith(): - Used to check if a string ends with a specified substring. 
	 * For example, the following code will check if the string "banana" ends with the substring "na":
	 */
	private static void endsWith() {
		String str = "banana";
		boolean endsWith = str.endsWith("na");
		System.out.println(endsWith); // true
	}

	/**
	 * equals(): - Used to check if two strings are equal. 
	 * For example, the following code will check if the strings "banana" and "apple" are equal:
	 */
	private static void equals() {
		String str1 = "banana";
		String str2 = "apple";
		boolean equals = str1.equals(str2);
		System.out.println(equals); // false
	}


	/**
	 * equalsIgnoreCase(): - Used to check if two strings are equal ignoring case. 
	 * For example, the following code will check if the strings "banana" and "BANANA" are equal ignoring case:
	 */
	private static void equalsIgnoreCase() {
		String str1 = "banana";
		String str2 = "BANANA";
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
		System.out.println(equalsIgnoreCase); // true
	}

	/**
	 * replace(): - Used to replace all occurrences of a specified substring with another substring in a string. 
	 * For example, the following code will replace all occurrences of the substring "ana" with the substring "xxx" in the string "banana":
	 */
	private static void replace() {
		String str = "banana";
		String str1 = str.replace("ana", "xxx");
		System.out.println(str1); // bxxxna
	}

	/**
	 * split(): - Used to split a string into an array of strings based on a specified delimiter. 
	 * For example, the following code will split the string "banana,apple,orange" into an array of strings based on the delimiter ","
	 */
	private static void split() {
		String str = "banana,apple,orange";
		String[] str1 = str.split(",");
		System.out.println(str1); // [banana, apple, orange]
	}


	/**
	 * substring(): - Used to extract a substring from a string. 
	 * For example, the following code will extract the substring "ana" from the string "banana":
	 */
	private static void substring() {
		String str = "banana";
		String str1 = str.substring(1, 4);
		System.out.println(str1); // ana
	}


	/**
	 * toCharArray(): - Used to convert a string into an array of characters. 
	 * For example, the following code will convert the string "banana" into an array of characters:
	 */
	private static void toCharArray() {
		String str = "banana";
		char[] str1 = str.toCharArray();
		System.out.println(str1); //
	}



}
