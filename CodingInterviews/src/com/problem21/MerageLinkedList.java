package com.problem21;

import java.util.Arrays;
import java.util.LinkedList;

import com.linkedList.LinkedListU;

public class MerageLinkedList {

	public static void main(String[] args) {
 
		
		LinkedList<LinkedList<Integer>> ls = new  LinkedList<LinkedList<Integer>>();
		ls.add(new LinkedList<Integer>(Arrays.asList(1,2,3,4)));
		ls.add(new LinkedList<Integer>(Arrays.asList(5,10,15,20)));
		ls.add(new LinkedList<Integer>(Arrays.asList(50,60,63,77)));
		
		mergeLists(  ls);
	}
	
	static void mergeLists(LinkedList<LinkedList<Integer>> ls ) {
	 
		 for (LinkedList<Integer> linkedList : ls) {
			  
	       System.out.println(linkedList.toString());
		}
	}

}
