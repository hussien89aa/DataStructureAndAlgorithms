package com.problem12;

import com.bst.Node;

public class Mirror {

	
	public static void main(String[] args) {
		
		new Mirror().buildTress();
	}
	
	
	void  buildTress() {
		
		// Tree 1
		 Node node1  = new Node(1, null, null);
		 Node node2  = new Node(2, null, null);
		 Node node3  = new Node(3, null, null);
		 Node node4  = new Node(4, null, null);
		 Node node5  = new Node(5, null, null);
		 
		 // build Tree 1
		 node1.leftNode = node3;
		 node1.rightNode = node2;
		 node2.leftNode = node5;
		 node2.rightNode = node4;
		 
		 explore1(node1);
		 
		 
		 System.out.println();
		 // build Tree 2
		 node1.leftNode = node2;
		 node1.rightNode = node3;
		 node2.leftNode = node4;
		 node2.rightNode = node5;
		 explore2(node1);
		
	}
	
	// TLR
	void explore1(Node node) {
		if( node !=null) {
			System.out.print( node.value +"\t");
			explore1(node.leftNode);
			explore1(node.rightNode);
		}
	}
	
	
	// TRL
	void explore2(Node node) {
		if( node !=null) {
			System.out.print( node.value +"\t");
			explore2(node.rightNode);
			explore2(node.leftNode);

		}
	}
	
	
}
