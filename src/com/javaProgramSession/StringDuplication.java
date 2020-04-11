package com.javaProgramSession;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringDuplication {

	public static void main(String[] args) {

		findDeplicateString("Mafaz is the Mafaz but Mafaz has computiter");
	}

	public static void findDeplicateString(String inputString) {
		
		String words[] =inputString.split(" ");
		
		Map<String, Integer> wordCount = new HashMap();
		
		for(String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}
			else {
				wordCount.put(word, 1);
			}
		}
		
		Set<String> wordsInString= wordCount.keySet();
		
		for(String word : wordsInString) {
			if(wordCount.get(word)>1);
			System.out.println(word + ":" + wordCount.get(word));
		}
		
		
	}
	
}
