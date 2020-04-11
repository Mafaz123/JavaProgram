package com.qa.javaprogramsession;

public class CountOfSmallCapitalSpecialLetters {

	public static void main(String[] args) {
		
		String s = "Hii all, Welcome to Java Selenium Training Session - Class starts at 10.31AM";
		
		int smallLetterCount =0;
		int capitalLetterCount=0;
		int numberCount=0;
		int specialcharCount=0;
		
		String smallLetters ="";
		String capitalLetters="";
		String numbers="";
		String specialcharacters="";
		
		for (int i=0; i<s.length(); i++) {
			char split=s.charAt(i);
			
			if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				smallLetterCount++;
				smallLetters= smallLetters+split;
			}
			else if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				capitalLetterCount++;
				capitalLetters = capitalLetters+split;
			}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				numberCount++;
			
			}
			else {
				specialcharCount++;
				specialcharacters = specialcharacters+split;
		}
	}	
		System.out.println("The Small Letter count is: " + smallLetterCount);
		System.out.println("The SmallLetters are: " + smallLetters);
		
		System.out.println("The Capital Letter count is: " +capitalLetterCount);
		System.out.println("The CapitalLetters are: " +capitalLetters);
		
		System.out.println("The Number count is: " +numberCount);
		System.out.println("The Numbers are: " +numbers);
		
		System.out.println("The Special Charaters count is: " +specialcharCount);
		System.out.println("The SpecialCharaters are: " +specialcharacters);

	}
}