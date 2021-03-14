package com.problem4;

import java.util.LinkedList;

import com.bst.BST;
import com.bst.Node;

public class SimilarTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          BST bst1 = new BST();
          bst1.add(4, bst1.root);
          bst1.add(3, bst1.root);
          bst1.add(6, bst1.root);
          
          BST bst2 = new BST();
          bst2.add(6, bst2.root);
          bst2.add(3, bst2.root);
          bst2.add(4, bst2.root);
          
          LinkedList<Integer> listOfNodes1 = new LinkedList<Integer>();
          explore(bst1.root, listOfNodes1);
          
          LinkedList<Integer> listOfNodes2 = new LinkedList<Integer>();
          explore(bst2.root, listOfNodes2);
          
          if(listOfNodes1.equals(listOfNodes2)) {
        	  System.out.println("Trees are equal");
          }else {
        	  System.out.println("Trees are not equal");  
          }
          System.out.println(listOfNodes1);
          System.out.println(listOfNodes2);
          
          
          
	}
	
	public static void explore( Node currentNode, LinkedList<Integer> listOfNodes) {
		
		if(currentNode== null) {
			return ;
		}
		//print the value
		explore(currentNode.leftNode, listOfNodes);
		listOfNodes.add(currentNode.value);
		explore(currentNode.rightNode, listOfNodes);
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
