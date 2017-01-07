package com.ds;

public class LinkedListUDemo {

	public static void main(String[] args) {
		LinkedListU<String> ls= new 	LinkedListU<String>();
		ls.add("Hussein");
		ls.add("Jena");
		ls.add("laya");
		ls.add("Waeel");
		System.out.println("before delete");
		ls.display();
		System.out.println("after delete");
	 ls.delete();
		 ls.display();

	}

}
