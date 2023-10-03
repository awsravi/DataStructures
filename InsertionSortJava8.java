package com.awsravi.DS;
import java.util.Arrays;

public class InsertionSortJava8 {
    public static void main(String[] args) {
        int[] arr = {684, 25, 182, 22, 11};

        int[] sortedArr = Arrays.stream(arr)
                .sorted()
                .toArray();

        System.out.println("Sorted array:");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
