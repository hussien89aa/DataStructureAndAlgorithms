package com.problem18;

import java.util.ArrayList;

public class SprialMatrix {

	public SprialMatrix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		ArrayList<Integer>  listElementasSprial= new SprialMatrix().printSprial(array);
		for (Integer element : listElementasSprial) {
			System.out.println(element);
		}
	 
	}
	
	ArrayList<Integer> printSprial(int[][] array) {
		
		ArrayList<Integer>  sprialList = new ArrayList<Integer>();
		int firstRow=0;
		int lastRow= array.length-1;
		int firstCol= 0;
		int lastCol= array[0].length-1;
		
		while( firstRow<lastRow && firstCol < lastCol) {
			
			
			// up
			for(int i=firstCol ;i<= lastCol ;i++) {
				sprialList.add(array[firstRow][i]);
			}
			
			for(int i= firstRow+1 ;i<= lastRow;i++) {
				sprialList.add(array[i][lastCol]);
			}
			
			for(int i=lastCol-1 ;i >= firstCol ;i--) {
				sprialList.add(array[lastRow][i]);
			}
			
			for(int i= lastRow-1; i> firstCol ;i--) {
				sprialList.add(array[i][firstCol]);
			}
			firstRow++;
			lastRow--;
			firstCol++;
			lastCol--;
			
		}
		
		
		return sprialList;
		
		
	}
 

}
