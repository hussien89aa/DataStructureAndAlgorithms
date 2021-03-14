package com.ds;

public class QueueLinkedListDemo {
public static void main(String[] args){
	QueueLinkedList<String> q= new
			QueueLinkedList<String>();
	q.Queue("Jena");
	q.Queue("Laya");
	q.Queue("Hussein");
	
	System.out.println(q.Dequeue());
	System.out.println(q.Dequeue());
	System.out.println(q.Dequeue());
	 System.out.println(q.Dequeue());
	
}
}
