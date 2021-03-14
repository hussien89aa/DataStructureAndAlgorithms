package com.problem14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FirendCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input
		int[][] connections = {
				{1,1,0,0,0},
				{1,1,1,0,0},
				{0,1,1,0,0},
				{0,0,0,1,1},
				{0,0,0,1,1}
		};
		
		ArrayList<ArrayList<Integer>> listOfCircles = new FirendCircle().getCircles(connections);
		for (ArrayList<Integer> circle : listOfCircles) {
			System.out.println(circle);
		}
	}
	
	
	ArrayList<ArrayList<Integer>> getCircles(int[][] connections){
		
		ArrayList<ArrayList<Integer>> listOfCircles =  new ArrayList<ArrayList<Integer>>();
		
		// save if person in any circle
		boolean[] visited = new boolean[ connections.length];
		
		for(int row=0;row< connections.length ; row++) {
			
			if(visited[row] == true) {
				continue;
			}
			
			visited[row] = true;
			
			Queue<Integer> circleQueue = new LinkedList<Integer>();
			
			circleQueue.add(row);
			ArrayList<Integer> listOfFirends = new ArrayList<Integer>();
			while( !circleQueue.isEmpty()) {
				
				int userID = circleQueue.poll();
				listOfFirends.add(userID);
				
				for( int userFirendsID =0;userFirendsID< connections[0].length;userFirendsID++) {
					
					if( connections[userID][userFirendsID]== 1 && visited[userFirendsID]!= true) {
						circleQueue.add(userFirendsID);
						visited[userFirendsID] = true;
					}
				}
				
			}
			
			listOfCircles.add(listOfFirends);
			
		}
		
		
		return listOfCircles;
	}

}
