package com.qa.javaprogramsession;

import java.util.Scanner;

public class SwappingNoWithout3rdVariable {

	public static void main(String[] args) {

		//1.Method(Using Scanner)
//		int a,b;
//		Scanner s= new Scanner(System.in);
//		System.out.println("Enter the variable");
//		a= s.nextInt();
//		b= s.nextInt();
//		
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		
//		System.out.println("The Swaping numbers are:");
//		System.out.println(a);
//		System.out.println(b);
		
		//2.Method
		int i=1,j=2;
		
		System.out.println("Enter the value:");
		
		i=i+j;
		j=i-j;
		i=i-j;
		
		System.out.println("i =" +i);
		System.out.println("j =" +j);
	
	
	//3.Method with third variable:
	int l=1,m=2;
	int n=0;
	
	n=l+m;
	l=n-l;
	m=n-m;
	
	System.out.println("l =" +l);
	System.out.println("m ="+ m);
}

}
