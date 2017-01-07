package com.ds;

public class QueueLinkedList<T> {
	NodeD Rear;
	NodeD Front;
	public QueueLinkedList() {
		Rear= null;
		Front=null;
	}
public void Queue(Object value){
	NodeD  newNode=new NodeD(value, null,null);
	if(Rear==null || Front==null){
		Rear=newNode;
		Front=newNode;
	}
	else{
		 newNode.next=null;
		 newNode.previous=Rear;
		 Rear.next=newNode;
		 Rear=newNode;
	}
}
public T Dequeue(){
	if(Rear==null || Front==null){
		System.out.println("queue is emplty");
		return null;
	}
	T value= (T)Front.value;
	Front= Front.next;
	if(Front !=null)
	Front.previous=null;
	return  value;
	
}
 
}
