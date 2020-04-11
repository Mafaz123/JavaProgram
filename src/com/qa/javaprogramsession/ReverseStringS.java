package com.qa.javaprogramsession;

import java.util.Scanner;

public class ReverseStringS {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Enter the String: ");
		 String a = input.nextLine();
		 int len = a.length();
		
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}		
	}

}
