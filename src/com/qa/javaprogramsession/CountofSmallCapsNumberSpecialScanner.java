package com.qa.javaprogramsession;

import java.util.Scanner;

public class CountofSmallCapsNumberSpecialScanner {


	public static void main(String args[]) {

	System.out.println("Enter the String:");
	Scanner input = new Scanner(System.in);
	String string = input.nextLine();
	
	String small="";
	String capital="";
	String numbers="";
	String special="";
	
	for(int i=0; i<string.length(); i++) {
	string.charAt(i);
	
	if(string.charAt(i)>='a' && string.charAt(i)<='z') {
		small = small+string.charAt(i);
	}else if(string.charAt(i)>='A' && string.charAt(i)<='Z') {
		capital = capital+string.charAt(i);
	}else if (string.charAt(i)>='0' && string.charAt(i)<='9') {
		numbers=numbers+string.charAt(i);
	}else {
		special=special+string.charAt(i);
	}
  }
	System.out.println("SmallLetters are:" + small + " ");
	System.out.println("Capital Letters are: " + capital);
	System.out.println("Numbers are:" + numbers);
	System.out.println("Special Characters are: " + special);
	}
}
