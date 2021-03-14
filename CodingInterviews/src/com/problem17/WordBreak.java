package com.problem17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

 
class Option{
	
	int nextIndex;
	public ArrayList<String>  listOfWords = new ArrayList<String>();
	
	public Option(int nextIndex, ArrayList<String>  listOfWords) {
		
		this.nextIndex = nextIndex;
		this.listOfWords.addAll(listOfWords);
	}
	
	
}

public class WordBreak {

 Set<String> dictionary = new HashSet<>();
	
	public WordBreak() {

		dictionary.add("mobile") ;
		dictionary.add("samsung") ;
		dictionary.add("sam") ;
		dictionary.add("sung") ;
		dictionary.add("man") ;
		dictionary.add("mango") ;
		dictionary.add("icecream") ;
		dictionary.add("and") ;
		dictionary.add("go") ;
		dictionary.add("i") ;
		dictionary.add("like");
		dictionary.add("ice") ;
		dictionary.add("cream") ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new WordBreak().breakWordNow("ilikesamsungandmango");
	}
	
	void breakWordNow(String word) {
		
		Queue<Option> q = new LinkedList<Option>();
		
		q.add( new Option(0,new ArrayList<String>()));
		
		while(!q.isEmpty()) {
			
			
			Option option = q.poll();
			
			if( option.nextIndex >= word.length()) {
				
				System.out.println(option.listOfWords);
				
			}
			
			for( int i=option.nextIndex;i<=word.length() ;i++ ) {
				
				String oneWord = word.substring(option.nextIndex,i);
				if( dictionary.contains(oneWord)) {
					
					Option newOption = new Option(i, option.listOfWords);
					newOption.listOfWords.add(oneWord);
					q.add(newOption);
					
					
				}
				
				
			}
			
		}
		
		
	}

}
