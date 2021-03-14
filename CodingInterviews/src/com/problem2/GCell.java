package com.problem2;

import java.util.ArrayList;

public class GCell {

	public int rowIndex;
	public int colIndex;
	public ArrayList<Integer> listOfCities;
	public GCell( int rowIndex,int colIndex,ArrayList<Integer> listOfCities) {
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
		this.listOfCities = new ArrayList<Integer>();
		if(listOfCities != null) {
           this.listOfCities.addAll(listOfCities);
		}
		this.listOfCities.add(colIndex);
				
		
	}

}
