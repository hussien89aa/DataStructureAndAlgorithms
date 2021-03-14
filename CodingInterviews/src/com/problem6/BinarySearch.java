package com.problem6;

public class BinarySearch {

	public static void main(String[] args) {

     int arr[]  = { 1,5,10,20,35,40,60,80,90,100};
     int search =61;
     
     // Binary search
     int low =0;
     int  high = arr.length -1;
     int mid =0;
     boolean isFoud = false;
     
     // find elment in Log(N)
     while(!isFoud) {
    	// break the loop when element not found
    	 if(low>high) {
    		 System.out.println("Element isnot there");
    		 break;
    	 }
    	 mid = low+((high-low)/2);
    	 if( arr[mid]== search) {
    		 System.out.println("Element is found");
    		 break;
    	 }else if(arr[mid]> search) {
    		 high = mid -1;
    	 }else if ( arr[mid]< search) {
    		 low = mid +1;
    	 }
    	 
    	 
    	 
    	 
     }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
