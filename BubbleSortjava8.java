package com.awsravi.DS;
import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSortjava8 {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);

        System.out.println("Bobble Sorted array:");
        Arrays.stream(arr)
            .forEach(num -> System.out.print(num + " "));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        IntStream.range(0, n - 1)
            .flatMap(i -> IntStream.range(0, n - i - 1))
            .filter(j -> arr[j] > arr[j + 1])
            .forEach(j -> {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            });
    }
}
