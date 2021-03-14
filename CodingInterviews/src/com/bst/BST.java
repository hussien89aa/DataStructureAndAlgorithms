package com.bst;
 

public class BST {
     public Node root;
     
     public BST() {
    	 root = null;
     }
     
     /*
      * Build Tree
      */
	public void add (int value, Node rootClone) {
		
		if( root ==null) {
			root = new Node(value, null, null);
			return;
		}
		
		if( value > rootClone.value) {
			
			if( rootClone.rightNode  == null) {
				rootClone.rightNode = new Node(value, null, null);
			}else {
				add(value, rootClone.rightNode);
			}
		}
		
		if( value < rootClone.value) {
			
			if( rootClone.leftNode  == null) {
				rootClone.leftNode = new Node(value, null, null);
			}else {
				add(value, rootClone.leftNode);
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
