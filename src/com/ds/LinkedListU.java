package com.ds;

public class LinkedListU<T> {
 Node head;
	public LinkedListU() {
	 head = null;
	}
// 	function to add value of type object and its children in linked list.
public void add(Object value) {
	Node  newNode = new Node(value, null);
	if(head == null)
		head = newNode;
	else {
		newNode.next=head;
		head = newNode;
	}
}
// 	function to delete node of linked list.
public void delete(){
	head = head.next;
	
}
// 	function to display elements of the linked list.
public void display(){
	Node n = head;
	while(n != null){
		System.out.println((T)n.value);
		n = n.next;
	}
}






}
