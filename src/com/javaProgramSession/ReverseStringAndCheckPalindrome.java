package com.javaProgramSession;

import java.util.Scanner;

public class ReverseStringAndCheckPalindrome {

	public static void main(String[] args) {

		String Actual, rev=" ";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the String and check its a Palindrome:");
		
		Actual = input.nextLine();
		int len = Actual.length();
		
		for(int i=len-1; i>=0; i++) {
			rev = rev + Actual.charAt(i);
			if(Actual.equals(rev)) {
				System.out.println("Entered String is Palindrome");
			}else {
				System.out.println("Enter String value is not a Palindrome");
			}
		}
	}

}
