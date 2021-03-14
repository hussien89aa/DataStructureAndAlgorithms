package com.sort;

public class BubbleSorting {

	static void BubbleSort(int[] arr){
		int n= arr.length;
		int temp=0;
		for(int i=0;i<n;i++)
			for(int j=1;j<(n-i);j++){
				
				if(arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]= temp;
				}
			}
	}
	
	
	public static void main(String[] args) {
	 int[] arr={1,50,30,10,60,80};
	 System.out.println("Before Sort");
	 for(int i=0;i<arr.length;i++)
	 System.out.print(arr[i] +"\t");
	 BubbleSort(arr);
	 System.out.println("\nAfter Sort");
	 for(int i=0;i<arr.length;i++)
	 System.out.print(arr[i] +"\t");
	}

}
