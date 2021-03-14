package com.problem8;

import java.util.ArrayList;
import java.util.Stack;

public class StairCaseDemo {

	public static void main(String[] args) {
   
		int step = 5;
		
		Stack<Stair> stairStack = new Stack<Stair>();
		stairStack.add(new Stair(0, new ArrayList<Integer>()));
		int numberOfTimes =0;
		while(!stairStack.isEmpty()) {
			Stair currentStair = stairStack.pop();
			if(currentStair.number == step) {
				System.out.println(currentStair.visited);
				numberOfTimes++;
				continue;
			} 
			
			int oneStair = currentStair.number +1;
			if(oneStair <= step) {
				stairStack.add(new Stair(oneStair, currentStair.visited));
			}
			
			int twoStair = currentStair.number +2;
			if(twoStair <= step) {
				stairStack.add(new Stair(twoStair, currentStair.visited));
			}
			
			
		}
		
		System.out.println("numberOfTimes:"+ numberOfTimes);
		

	}

}
