package com.tree;

public class BST {
Node root;
	public BST() {
		root=null;
	}

	public Node NodeCreate(int value){
		return new Node(value, null, null);
	}
	public void add(Node start, Node newNode){
		if(root==null){
			root=newNode;
			return;
		}
		if(newNode.value> start.value){
			if( start.right==null)
				start.right=newNode;
			add(start.right,newNode);
		}
		if(newNode.value< start.value){
			if( start.left==null)
				start.left=newNode;
			add(start.left,newNode);
		}
	}

public void Search(int value, Node start){
	
	if(start==null){
		System.out.println("node isnot found");
		return;
	}
	if(start.value==value)
	{
		System.out.println("node is found");
		return;
	}
	if( value>start.value){
		Search(value, start.right);
	}
	if( value<start.value){
		Search(value, start.left);
	}
}

}
