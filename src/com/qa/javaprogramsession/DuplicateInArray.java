package com.qa.javaprogramsession;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		//Find duplicate value in Given String and Integer
		//Using Set interface
		
		int numbers[] = {1,2,3,4,5,5,4};
		
		//Set always store unique values
		Set<Integer> FindDuplicate = new HashSet<Integer>();
		
		for(int number : numbers) {
			if(FindDuplicate.add(number)==false) {
				System.out.println("duplicate value ");		
		String values[] = {"good","bye", "good", "girl", "good"};
		Set<String> actual = new HashSet<String>();
		
		for (String value : values) {
			if (actual.add(value)==false) {
				System.out.println("Duplicate String :" + value);
			}
		}

	}

		}}}
