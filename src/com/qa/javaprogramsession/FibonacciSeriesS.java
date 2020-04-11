package com.qa.javaprogramsession;

public class FibonacciSeriesS {

	public static void main(String[] args) {

		int a = 50, b = 51;
		int c = 0;
		while (c < 100) {
			c++;
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");

		}

	}
}
