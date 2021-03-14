package com.ds;

public class QueueArray<T> {
Object[] ArrayQueue;
int Rear;
int Front;
int size;
	public QueueArray(int size) {
	this.size=size;
	ArrayQueue= new Object[this.size];
	Front=-1;
	Rear=-1;
	}

	public Boolean isFull(){
		return(Rear==size-1);
	}
	public Boolean isEmplty(){
		return(Front==-1|| Front>Rear);
	}
	public void Queue(Object newItem){
		if(isFull()){
			System.out.println("queue is full");
			return;
		}
		Rear=Rear+1;
		ArrayQueue[Rear]= newItem;
		if(Front==-1)
			Front=0;
	}
	public T DeQueue(){
		if(isEmplty()){
			System.out.println("queue is empty");
			return null;
		}
		T ObjectOut=(T) ArrayQueue[Front];
		Front=Front+1;
		return ObjectOut;
	}
}
