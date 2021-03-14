package com.problem15;

import java.util.Arrays;
import java.util.Stack;

public class WordDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// input
		String[] dic = {"hot","dot","dog","lot","log","cog"};
		String start= "hit";
		String end = "cog";
		
		boolean isFound =new WordDistance().findPath(dic, start, end);
		System.out.println("isFound: "+ isFound);
	}
	
	
	boolean findPath( String[] dic,String startWord, String endWord) {
		
		boolean isFound =false;
		
		boolean[] visited = new boolean[dic.length];
	 
		Stack<String> stack = new Stack<String>();
		stack.push(startWord);
		
		while(!stack.isEmpty()) {
			
			String word = stack.pop();
			if( distance( word, endWord)==0) {
				stack.push(word);
				System.out.println(stack);
				isFound= true;
				break;
			}
			
			for(int i=0;i<dic.length;i++) {
				
				if(visited[i] == true) {
					continue;
				}
				
				int distnace = distance(word, dic[i]);
				if( distnace == 1) {
					visited[i] = true;
					stack.push(word);
					stack.push(dic[i]);
					break;
				}
			}
			
		}
	 
		return isFound;
		
	}
	
	int distance(String word1, String word2) {
		int distnace =3; // we assume all words has lenight 3
		for(int i=0;i<word1.length();i++) {
			if( word1.charAt(i) == word2.charAt(i)) {
				distnace--;
			}
		}
		
		return distnace;
	}

}
