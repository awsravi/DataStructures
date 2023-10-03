package com.awsravi.DS;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.Collectors;

public class LinearSearchJava8 {
	public static void main(String[] args) {

		int[] arr = { 23, 46, 73, 65, 22 };
		int target = 65;


		OptionalInt result=Arrays.stream(arr).filter(i -> i==target).findFirst();
		
		if(result.isPresent())
		{		
			int index=Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(target);
			System.out.println("Element " + target +" position "+index);
		}
		else {
			System.out.println("Element "+target +" not fount");
		}
	}
}
