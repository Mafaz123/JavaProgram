package com.qa.javaprogramsession;

public class PalindromeNumber {

	public static void isGivenNumber(int num) {
		System.out.println("Enter the number: " + num);
		int rem = 0, sum = 0;
//		int temp;
//		temp = num;

		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}

		if (num==sum) {
			System.out.println("The given no is Palindrome");
		} else {
			System.out.println("The given no is not a Palindrome");
		}
	}

	public static void main(String[] args) {
		isGivenNumber(1231);

	}

}
