package com.tree;

public class BSTDemo {

	public static void main(String[] args) {
		BST bt= new BST();
		
		bt.add(bt.root, bt.NodeCreate(10));
		bt.add(bt.root, bt.NodeCreate(12));
		bt.add(bt.root, bt.NodeCreate(11));
		bt.add(bt.root, bt.NodeCreate(13));
		bt.add(bt.root, bt.NodeCreate(6));
		bt.Search(111, bt.root);
	}

}
