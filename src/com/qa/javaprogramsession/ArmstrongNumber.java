package com.qa.javaprogramsession;

public class ArmstrongNumber {

	public static boolean ArmstrongNumber(int num) {
		
		int r=0, cube=0;
		int t;
		t=num;
		
		while(num >0) {
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
		}
		
		if(t==cube) {
			System.out.println("It's a armstrong number");
		}
		return false;
	}

	public static void getArmstrongNumber(int num) {
		
		
		for (int i=1; i<=num; i++) {
			if (ArmstrongNumber(num)) {
				System.out.print(i + " ");
			}
		}
		
	}
	public static void main(String[] args) {
		ArmstrongNumber(11);
		
		getArmstrongNumber(10);
		}

}
