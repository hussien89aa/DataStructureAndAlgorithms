package com.problem20;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class TopMoviesInStream {

	public static void main(String[] args) {

      int[] streamRating = {3,4,5,2,4,5,1,1,2};
 
      
      kthTopRating(streamRating, 3);
      
       

	}
	
	static void kthTopRating( int[] streamRating, int k) {
	      
	      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	   
	      // streaming
	      for(int i=0;i<streamRating.length;i++) {
	    	  
	    	  pq.add(streamRating[i]);
	    	  if(pq.size() > k) {
	    		  pq.poll();
	    	  }
	    	  
	    	   System.out.println(pq.toString());
	      }
	}

}
