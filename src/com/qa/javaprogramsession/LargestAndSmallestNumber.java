package com.qa.javaprogramsession;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
	
		
		int numbers[] = {2,3,678,789,12334, 111, 20, -81, -99, 363, 946,999, 123};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest)
				smallest = numbers[i]; 
		}
		System.out.println("Given arrays are: " + Arrays.toString(numbers));
		System.out.println("Largest number is: " + largest);
		System.out.println("Smallest number is; " + smallest);
		
	}
}
