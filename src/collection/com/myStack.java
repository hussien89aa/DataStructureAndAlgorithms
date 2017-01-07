package collection.com;

import java.util.Stack;

public class myStack {

	public static void main(String[] args) {
	 
		Stack<String> st= new Stack<String>();
		st.push("Admins");
		st.push("Manager");
		st.push("Tester");
		System.out.println(st.pop());
	}

}
