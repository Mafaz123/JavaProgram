package com.javaProgramSession;

import java.util.Scanner;

public class ReverseStringS {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Enter the String: ");
		 String a = input.next();
		 int len = a.length();
		
		String rev = "";
//		System.out.println("Reverse String is: ");
		for(int i=len-1;i>=0;i--) {
			System.out.print
			(a.charAt(i));
		}
	}

}
