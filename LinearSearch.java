package com.awsravi.DS;

public class LinearSearch {
	public static void main(String[] args) {

		int[] arr = { 92, 22, 64, 74, 38, 55 };
		int target = 74;

		int index = linearsearch(arr, target);
		if (index != -1) {
			System.out.println("element " + target + " position " + index);
		} else {
			System.out.println("element " + target + "not found ");
		}
	}

	public static int linearsearch(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;

			}
		}

		return -1;

	}
}
