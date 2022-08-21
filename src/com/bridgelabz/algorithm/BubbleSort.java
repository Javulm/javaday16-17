package com.bridgelabz.algorithm;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println(
				"Enter Total Nos. of Array Elements You Want To sort: ");
		Scanner sc = new Scanner(System.in);
		int totalElements = sc.nextInt();
		int arr[] = new int[totalElements];

		System.out.println("Enter " + totalElements + " Array Elements: ");
		for (int i = 0; i < totalElements; i++)
			arr[i] = sc.nextInt();
		BubbleSort bs = new BubbleSort();
		bs.sort(arr, totalElements);
	}
	/**
	 * arr is the array that holds the array elements arrLength is the Length of
	 * the Array
	 */
	private void sort(int[] arr, int arrLength) {
		System.out.println("Before Sorting");
		// prints the array before sorting
		for (int i = 0; i < arrLength; i++)
			System.out.print(arr[i] + " ");

		System.out.println("\nAfter Sorting\n___________________\n");
		for (int i = 0; i < arrLength - 1; i++) {
			/**
			 * this loop will execute i-1 times as the last index will be stored
			 * in 'i' we compare 'j-th index' with the next index for sorting
			 */
			for (int j = 0; j < arrLength - i - 1; j++) {
				int temp;
				// swap arr[j+1] and arr[i]
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// prints the array
		for (int i = 0; i < arrLength; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
