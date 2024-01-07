package com.java.basics.array;

import java.util.Scanner;

public class LargestElement {

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

        // Find the largest element in the array
        int largestElement = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }

        // Print the largest element
        System.out.println("The largest element in the array is: " + largestElement);
    }
}
