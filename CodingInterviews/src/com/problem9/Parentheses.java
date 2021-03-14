package com.problem9;

import java.util.Stack;

public class Parentheses {

	public static void main(String[] args) {

    String text = "((()()))";
    Stack<Character> st1 = new Stack<Character>();
    for(int i=0;i<text.length();i++) {
    	st1.push(text.charAt(i));
    }
    
    Stack<Character> st2 = new Stack<Character>();
    boolean isValid = true;
    
    while(!st1.isEmpty()) {
    	
    	 char parn = st1.pop();
    	 
    	 if(parn == ')') {
    		 st2.push(parn);
    	 }else {
    		 if(st2.isEmpty()) {
    			 isValid =false;
    			 break;
    		 }else {
    			 st2.pop(); // take one close out
    		 }
    		 
    	 }
    	
    }
    
    if( isValid && st1.isEmpty()  && st2.isEmpty()) {
    	System.out.println("Expresion is Valid");
    }else   {
    	System.out.println("Expresion is not Valid");
    }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
