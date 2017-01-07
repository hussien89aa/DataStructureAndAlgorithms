package com.ds;

public class StackArrayDemo {

	public static void main(String[] args) {
		StackArray<Integer> st= new StackArray<Integer>(5);
		st.push(10);
		st.push(12);
		st.push(13);
		st.push(14);
		st.push(15);
		 st.push(16);
		while(!st.isEmplty()){
		 System.out.println(st.pop());
		}
		st.pop();

	}

}
