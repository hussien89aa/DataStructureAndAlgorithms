package com.problem2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TripPlaner {

	public static void main(String[] args) {
		 
		//We give 9 for post location
		int[][] grid = {{1,1,1,1,0},{0,1,0,1,0},{0,0,1,1,0}, {0,0,1,1,0},{0,0,0,1,0},
				 {0,0,0,0,1}};
		print(grid);
		
		Queue<GCell> queue = new LinkedList<GCell>();
		//Set robot location
		move(grid,queue, 0,0, null);
		
		while ( !queue.isEmpty()) {
			
			GCell botCell =  queue.poll();
			 
			// down
			
			move (grid, queue, botCell.rowIndex + 1, botCell.colIndex, botCell.listOfCities);
			
			//right
			move (grid, queue, botCell.rowIndex + 1, botCell.colIndex+ 1, botCell.listOfCities);
	 
		}
		System.out.println("Not path found");
		
	}
	
	static void move( int[][] grid, Queue<GCell> queue, int newRow, int newCol, ArrayList<Integer> listOfCities) {
		
		// make sure the robot in the grid
		if( newRow >=0 && newRow < grid.length &&  newCol >= 0 && newCol < grid[0].length) {
			
			 if(  grid[newRow][newCol] == 1 && newCol == grid[0].length-1 ) {
				//path is found
				 listOfCities.add(newCol);
				System.out.println("Path is found, Distnace: "+ listOfCities);
				System.exit(0);
			}else if ( grid[newRow][newCol] == 1) {
				 
				queue.add(new GCell(newRow, newCol, listOfCities));
				grid[newRow][newCol] = -1; // cell is visited
			}
			
		}
	}

	static void print( int[][] grid) {
		
		for(int i=0;i<grid.length ; i++) {
			
			for (int j=0;j<grid[0].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	
}
