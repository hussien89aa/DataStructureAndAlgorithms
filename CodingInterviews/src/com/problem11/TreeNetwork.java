package com.problem11;

import java.util.ArrayList;

import com.bst.Node;

public class TreeNetwork {

	public static void main(String[] args) {
		 
		//create the tree
		Node node1 = new Node(1, null, null);
		Node node2 = new Node(2, null, null);
		Node node3 = new Node(3, null, null);
		Node node4 = new Node(4, null, null);
		Node node5 = new Node(5, null, null);
		
		node1.leftNode = node3;
		node1.rightNode = node2;
		
		node2.leftNode = node5;
		node2.rightNode = node4;
		
		TreeNetwork treeNetwork=new TreeNetwork();
		treeNetwork.serialize(node1);
		System.out.println(treeNetwork.serializeList);
		
		Node head = treeNetwork.deSerialize();
		
		TreeNetwork treeNetwork1=new TreeNetwork();
		treeNetwork1.serialize(head);
		System.out.println(treeNetwork1.serializeList);
		
	}
	
	ArrayList<Integer> serializeList = new ArrayList<Integer>();
	void serialize(Node node) {
		
		if(node != null) {
		    serializeList.add(node.value);
			serialize(node.leftNode);
			serialize(node.rightNode);
		
		}else {
			serializeList.add(-1);
		}
	}
	
	int index =0;
	Node deSerialize() {
		
		if( index >serializeList.size()-1 ||  serializeList.get(index)==-1) {
			index ++;
			return null;
		}
		
		Node newNode = new Node(serializeList.get(index++), null, null);
		newNode.leftNode = deSerialize() ;
		newNode.rightNode = deSerialize() ;
		return newNode; 
	}
	
	
	
	
	

}
