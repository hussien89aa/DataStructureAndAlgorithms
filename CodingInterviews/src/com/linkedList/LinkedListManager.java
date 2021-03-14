package com.linkedList;

public class LinkedListManager {

	public static void main(String[] args) {
		
		LinkedListU<String> ls = new 	LinkedListU<String>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		ls.display();

		deleteKthElement(ls.head, 2);
		System.out.println("After delete");
		ls.display();

	}
	
	static void deleteKthElement(ListNode root, int k) {
		
		//init
		ListNode slowPtr = root;
		ListNode fastPtr = root;
		
		// move fast ptr to slow + k
		while(k>0) {
			fastPtr = fastPtr.next;
			k--;
		}
		
		while(fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}
		
		slowPtr.next = slowPtr.next.next;
		
	}
}
