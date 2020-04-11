package com.qa.javaprogramsession;

public class OddNumbersAndEvenNumbers {

	public static void main(String[] args) {
		
		int count = 0;
		System.out.println("The Even numbers are: ");
		for (int i=1; i<10; i++) {
			if (i%2==0) {
//				count = i;
//				System.out.println( " " +count );// To print Even numbers 
				count = count +i;
				System.out.print(count);// To print sum of Even Numbers
				
			}
		}
		System.out.println("");
		System.out.println("The Odd Numbers are:");
		for (int j=1; j<10; j++) {
			if (j%2==1) {
//				count = j;
//				System.out.println(" "+ count);
				count = count + j;
				System.out.print(count);// To print sum of Odd	 Numbers
			}
		}
	}

}
