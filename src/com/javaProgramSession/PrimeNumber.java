package com.javaProgramSession;

public class PrimeNumber {

	
	public static boolean isPrimNumber(int num) {
//		System.out.println("Enter number is: " +num);
		for (int i=2; i<num;i++) {
			if (num % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void getPrimeNumber(int num) {
		
		for (int i=2; i<=num; i++) {
			if(isPrimNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		
		System.out.println("19 is Prime Number: " +isPrimNumber(19));
		System.out.println("21 is Prime Number: " +isPrimNumber(21));
		System.out.println("2 is Prime Number: " +isPrimNumber(2));
		
		getPrimeNumber(19);
	}

}
