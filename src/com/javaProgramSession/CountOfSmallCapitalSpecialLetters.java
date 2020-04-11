package com.javaProgramSession;

public class CountOfSmallCapitalSpecialLetters {

	public static void main(String[] args) {
		
		String s = "HI all, Welcome to Java Selenium Training Session - Class starts at 10.31AM";
		
		int smallLetters =0;
		int capitalLetters=0;
		int numbers=0;
		int specialchar=0;
		
		String small ="";
		String capital="";
		String number="";
		String specialcharacter="";
		
		for (int i=0; i<s.length(); i++) {
			s.charAt(i);
			char ch=s.charAt(i);
			if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				small= small+ch;
//				System.out.println(count);
			}
			else if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				capitalLetters++;
				capital = capital+ch;
//				System.out.println(count1);
			}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				numbers++;
				number= number+ch;
//				System.out.println(count2);
			}
			else {
				specialchar++;
				specialcharacter = specialcharacter+ch;
//				System.out.println(count3);
			}
			
		}
		
		System.out.println("The Small Letter count is: " + smallLetters);
		System.out.println("The Capital Letter count is: " +capitalLetters);
		System.out.println("The Number count is: " +numbers);
		System.out.println("The Special Charaters count is: " +specialchar);
		
		System.out.println("The Small Letter count is: " + small);
		System.out.println("The Capital Letter count is: " +capital);
		System.out.println("The Number count is: " +number);
		System.out.println("The Special Charaters count is: " +specialcharacter);
		
	}

}
