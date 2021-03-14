package com.problem7;

public class LCS {

	public LCS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 
		String text = "aaabcdeeeefffffgmklmooo";
		
		int index =0;
		char currentChar =  text.charAt(index);
		index++;
		int sequence =1;
		int maxSequence =0;
		
		while(index < text.length()) {
			
			
			if(text.charAt(index) != currentChar) {
				sequence++;
			}else {
				 
				if(sequence > maxSequence) {
					maxSequence = sequence;
				}
	
			    sequence =1;
			}
			currentChar =  text.charAt(index);
			
			index++;
		}
		System.out.println("max Seququece:" +  maxSequence);
		
		
		
		
		
	}

}
