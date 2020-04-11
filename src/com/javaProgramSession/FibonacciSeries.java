package com.javaProgramSession;

public class FibonacciSeries {

	public static void main(String[] args) {

// 1.Method
		int a=0, b=1;
//		int c;
//		for (int i=2; i<=10;i++) {
//			c=a+b;
//			System.out.println(c);
//
//			a=b;
//			b=c;
//			
//		}
		
		int c = 0;
		while(c<100) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c + " ");
		}
		
			}

}
