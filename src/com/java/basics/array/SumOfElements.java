package com.java.basics.array;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array
        int[] arr = new int[size];

        // Get the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        // Print the sum
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
