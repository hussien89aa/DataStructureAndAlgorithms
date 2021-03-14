package com.ds;

public class DynamicArrayDemo {

	public static void main(String[] args) {
		DynamicArray<Integer> da= new DynamicArray<Integer>();
		da.put(11);
		System.out.println("Size:"+ da.getSize());
		da.put(12);
		System.out.println("Size:"+ da.getSize());
		da.put(13);
		System.out.println("Size:"+ da.getSize());
		da.put(14);
		System.out.println("Size:"+ da.getSize());
		da.put(15);
		System.out.println("Size:"+ da.getSize());
		System.out.println("Element saved is:");	
 for (int i=0;i<da.getSize();i++)
	 System.out.println(da.get(i));
	}

}
