package com.java.basics.array;

import java.util.Scanner;

public class SmallestElement {

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

        // Find the smallest element in the array
        int smallestElement = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < smallestElement) {
                smallestElement = arr[i];
            }
        }

        // Print the smallest element
        System.out.println("The smallest element in the array is: " + smallestElement);
    }
}
