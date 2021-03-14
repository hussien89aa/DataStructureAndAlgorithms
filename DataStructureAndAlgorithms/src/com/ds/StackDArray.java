package com.ds;

import java.util.Arrays;

public class StackDArray<T> {
	Object[] ArrayStack;
	int size;
	int top;
		public StackDArray(int size) {
		 this.size=size;
		 ArrayStack= new Object[this.size];
		 top=-1;
		}
		
		public void push(Object newItem){
			ensureCapacity(top+2);
			
			top=top+1;
			ArrayStack[top]=newItem;
		}
		public void ensureCapacity( int minCapacity){
			int oldCapacity= getSize();
			if(minCapacity>oldCapacity){
				int newCapacity=oldCapacity*2;
				if(newCapacity<minCapacity)
					newCapacity=minCapacity;
				ArrayStack=Arrays.copyOf(ArrayStack, newCapacity);
			}
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
		
		public int getSize(){
			return ArrayStack.length;
		}
		
		
		
}
