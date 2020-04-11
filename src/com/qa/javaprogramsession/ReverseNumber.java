package com.qa.javaprogramsession;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num, i=0, j=0;
		System.out.println("Enter the numbers:");
		Scanner s = new Scanner(System.in);
		int sum= s.nextInt();
		
		num=sum;
		
		while (num>0) {
			i = num%10;
			j =(j*10)+i;
			num =num/10;
			
		}System.out.println("Reverse numbers are:" + j);
		
	}
	

}
