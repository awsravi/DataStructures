package com.awsravi.DS;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BinarySearchJava8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 8, 12, 19, 27, 34, 42, 51, 66, 73);
        int target = 34;

        Optional<Integer> result = binarySearch(list, target);

        if (result.isPresent()) {
            System.out.println("Element " + target + " found at index " + result.get());
        } else {
            System.out.println("Element " + target + " not found in the list");
        }
    }

    public static Optional<Integer> binarySearch(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = list.get(mid);

            if (midValue == target) {
                return Optional.of(mid);
            }

            if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return Optional.empty();
    }
}
