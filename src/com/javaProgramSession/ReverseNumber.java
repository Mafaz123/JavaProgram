package com.javaProgramSession;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int a, i=0, j=0;
		System.out.println("Enter the numbers:");
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		a=n;
		
		while (a>0) {
			i = a%10;
			j =(j*10)+i;
			a =a/10;
			
		}System.out.println("Reverse numbers are:" + j);
		
	}
	

}
