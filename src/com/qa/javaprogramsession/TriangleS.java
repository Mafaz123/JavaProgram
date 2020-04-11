package com.qa.javaprogramsession;

public class TriangleS {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(" *");
//				System.out.println("");
			}System.out.println(" ");
		}
		
		int value =1;
		for (int i=1; i<=4; i++) {
//			System.out.println();
			for (int j=1; j<=i; j++) {
				System.out.print(value);
				value++;
			}System.out.println();
//			for(int k=1; k<=i; k++) {
//				System.out.print(" *");
////				System.out.println("");
//			}System.out.println(" ");
		}

		
	}
}