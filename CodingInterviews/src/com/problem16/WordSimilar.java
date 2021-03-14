package com.problem16;

import java.util.Arrays;

public class WordSimilar {

	public static void main(String[] args) {

		String  word1 = "loop";
		String word2 ="pool";

		
		boolean isSimilar = new WordSimilar().isSimilar(word1, word2);
		System.out.println("Similar?:" + isSimilar);
		
	 
	}
	
	boolean isSimilar(String word1,String word2) {
		
		 
		if(word1.length()!= word2.length()) {
			return false;
		}
		
		// sort
		char[] word1Array = word1.toCharArray();
		Arrays.sort(word1Array);
		
		char[] word2Array = word2.toCharArray();
		Arrays.sort(word2Array);
		
		// check if all character are similar
		for(int i=0;i< word1Array.length ;i++) {
			
			if(word1Array[i] != word2Array[i]) {
				return false;
			}
		}
		
		return true;
		
		
	}

}
