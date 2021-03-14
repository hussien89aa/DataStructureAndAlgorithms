package com.linkedList;

public class LinkedListU<T> {
	
	ListNode head;
		public LinkedListU() {
		 head= null;
		}
	public void add(Object value){
		ListNode  newNode=new ListNode(value, null);
		if(head==null)
			head=newNode;
		else{
			newNode.next=head;
			head= newNode;
		}
	}
	public void delete(){
		head=head.next;
		
	}
	public void display(){
		ListNode n=head;
		while(n!=null){
			System.out.println((T)n.value);
			n=n.next;
		}
	}


}
