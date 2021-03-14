package com.ds;

public class StackArray<T> {
Object[] ArrayStack;
int size;
int top;
	public StackArray(int size) {
	 this.size=size;
	 ArrayStack= new Object[this.size];
	 top=-1;
	}
	
	public void push(Object newItem){
		if(isFull()){
			System.out.println("stack is full");
			return;
		}
		top=top+1;
		ArrayStack[top]=newItem;
	}
	public Boolean isFull(){
		return(top==size-1);
	}
	
	public T pop(){
		if(isEmplty()){
			System.out.println("stack is empty");
			return null;	
		}
		T item=(T) 	ArrayStack[top];
		top=top-1;
		return item;
		
	}
	public Boolean isEmplty(){
		return(top==-1);
	}
	
	
	
	
	
	
	
	
	

}
