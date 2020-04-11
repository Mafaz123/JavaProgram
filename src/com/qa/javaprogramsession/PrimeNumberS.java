package com.qa.javaprogramsession;

import java.util.Scanner;

public class PrimeNumberS {

	public static void main(String[] args) {

		int n;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the number:");
		n = input.nextInt();
		
		int count =0;
		
		 for (int i =2; i<n/2; i++) {
			 if (n%i==0) {
				 count = 1;
			 }
		 }
		 
		 if (count ==0) {
			 System.out.println("Its a prime Number");
		 }else {
			 System.out.println("Its not a prime Number");
		 }
		 
//		 int count1 =0;
//			
//		 for (int j =2; count1<n/2; j++) {
//			boolean flag = false;
//			 for (int i =2; i<j/2; i++) {
//				 if (j%i==0) {
//					 break; 
//					 }
//							 
//		 }
//		 
//		 if (count1 ==0) {
//			 System.out.println("Its a prime Number");
//		 }else {
//			 System.out.println("Its not a prime Number");
//		 }
//	}
//
	}

}
