package com.qa.javaprogramsession;

import java.util.Scanner;

public class ReverseStringAndCheckPalindrome {

	public static void main(String[] args) {

		String actual, rev = " ";

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String and check its a Palindrome:");

		actual = input.nextLine();
		int length = actual.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + actual.charAt(i);
		}
		if (actual.equals(rev)) {
			System.out.println("Entered String is Palindrome");
		} else {
			System.out.println("Enter String is not a Palindrome");
		}
	}

}
