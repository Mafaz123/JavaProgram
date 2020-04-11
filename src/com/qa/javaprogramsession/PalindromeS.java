package com.qa.javaprogramsession;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class PalindromeS {

	public static void main(String[] args) {
	
		int rem=0, sum=0, num;
		System.out.println("Enter the Number: ");
		Scanner input = new Scanner (System.in);
		num = input.nextInt();
		
		while (num > 0) {
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		
		if (num==sum) {
			System.out.println("Given number is Palindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}
		
	}

}
