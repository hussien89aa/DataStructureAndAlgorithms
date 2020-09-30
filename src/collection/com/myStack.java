package collection.com;

import java.util.Stack;

public class myStack {

	public static void main(String[] args) {
	 
		Stack<String> st= new Stack<String>();
		st.push("Admins");
		st.push("Manager");
		st.push("Tester");
		System.out.println(st.peek());
	        System.out.println(st.search("Admins"));
		System.out.println(st.search("manager"));
		System.out.println(st);
		System.out.println(st.empty());
		System.out.println(st.pop());
	}

}
