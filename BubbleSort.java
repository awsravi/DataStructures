package com.awsravi.DS;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		bubbleSort(arr);

		System.out.println("Bobble Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			// Compare and swap adjacent elements
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j + 1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// If no two elements were swapped in the inner loop, the array is already
			// sorted
			if (!swapped) {
				break;
			}
		}
	}
}
/*
 * import java.util.Arrays;
 * 
 * public class BubbleSortWithStreams {
 *  public static void main(String[] args) {
 * int[] arr = {64, 34, 25, 12, 22, 11, 90};
 * 
 * int[] sortedArr = Arrays.stream(arr) .sorted() .toArray();
 * 
 * System.out.println("Sorted array:"); for (int num : sortedArr) {
 * System.out.print(num + " "); } } }
 * 
 */
