package com.problem13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

import com.bst.Node;
 

public class GraphLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Tree 1
		 Node node1  = new Node(1, null, null);
		 Node node2  = new Node(2, null, null);
		 Node node3  = new Node(3, null, null);
		 Node node4  = new Node(4, null, null);
		 Node node5  = new Node(5, null, null);
		 Node node6  = new Node(6, null, null);
		 
		 // build Tree 1
		 node1.leftNode = node3;
		 node1.rightNode = node2;
		 node2.leftNode = node5;
		 node2.rightNode = node4;
		 node3.leftNode = node6;
		 
		 ArrayList<ArrayList<Integer>> listOfLevels = new GraphLevel().getLevels(node1);
		 for (ArrayList<Integer> level : listOfLevels) {
			System.out.println(level);
		}
		 
		 // balance
		 ArrayList<ArrayList<Integer>> listOfLevels1 = new GraphLevel().getLevels(node1.leftNode);
		 ArrayList<ArrayList<Integer>> listOfLevels2 = new GraphLevel().getLevels(node1.rightNode);
		 System.out.println(listOfLevels1.size() + "," + listOfLevels2.size());
		 if(listOfLevels1.size() == listOfLevels2.size()) {
			 System.out.println(" Tree balance");
		 }else {
			 System.out.println(" Tree not balance"); 
		 }
		 
	}
	
	
	ArrayList<ArrayList<Integer>> getLevels( Node node){
		
		ArrayList<ArrayList<Integer>> listOfLevels = new ArrayList<ArrayList<Integer>>();	
		
		Queue<Node> nodesQueue = new LinkedList<Node>();
		nodesQueue.add(node);
		int preLevel =1;
		int currentLevel=0;
		ArrayList<Integer> levelElements = new ArrayList<Integer>();
		while( !nodesQueue.isEmpty()) {
			
			Node newNode = nodesQueue.poll();
			levelElements.add(newNode.value);
			if( newNode.leftNode != null) {
				nodesQueue.add(newNode.leftNode);
				currentLevel++;
			}
			
			if( newNode.rightNode != null) {
				nodesQueue.add(newNode.rightNode);
				currentLevel++;
			}
			
			preLevel --;
			if(preLevel==0) {
				listOfLevels.add(levelElements);
				preLevel = currentLevel;
				currentLevel = 0;
				levelElements = new ArrayList<Integer>();
				
			}
		}
		
		
		
		return listOfLevels;
		
	}

}
