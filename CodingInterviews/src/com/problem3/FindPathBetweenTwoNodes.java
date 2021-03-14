package com.problem3;

import java.util.ArrayList;

import com.bst.BST;
import com.bst.Node;

public class FindPathBetweenTwoNodes {

	public static void main(String[] args) {
		 //  build the tree
		BST bst = new BST();
		bst.add(8, bst.root);
		bst.add(5, bst.root);
		bst.add(10, bst.root);
		bst.add(9, bst.root);
		bst.add(11, bst.root);
		bst.add(5, bst.root);
		bst.add(4, bst.root);
		bst.add(6, bst.root);
		
		findPath(4, bst.root);
		findPath(9, bst.root);
		System.out.println("steps:" + steps);
		System.out.println("visited Nodes:"+ listVisited);
		
	}
	
	static int steps =0;
	static ArrayList<Integer> listVisited = new ArrayList<Integer>();
	
	public static void findPath( int searchValue, Node currentNode) {
		
		// find path
		if(! listVisited.contains(currentNode.value)) {
			listVisited.add(currentNode.value);
			steps++;
		}else {
			steps--;
		}
		
		if( currentNode.value ==  searchValue ) {
			return;
		}
		if( searchValue > currentNode.value) {
			findPath(searchValue, currentNode.rightNode);
		}
		if( searchValue < currentNode.value) {
			findPath(searchValue, currentNode.leftNode);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
