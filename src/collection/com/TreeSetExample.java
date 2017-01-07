package collection.com;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class TreeSetExample {
	 public static void main(String args[]){  
		   
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  // object
		  System.out.println("*************** object");
		  TreeSet<NodeS> s= new TreeSet<NodeS>();
		    s.add(new NodeS(61,null));
			s.add(new NodeS(3,null));
			s.add(new NodeS(6,null));
			s.add(new NodeS(4,null));
			  Iterator<NodeS> itr2=s.iterator();  
			  while(itr2.hasNext()){  
			   System.out.println(itr2.next().cost);  
			  }  
		 }  
}
 
 
class NodeS implements Comparable<NodeS>{
	 int cost;
	 NodeS next;
	 public NodeS(int cost, NodeS next){
		 this.cost=cost;
		 this.next=next;
	 }
	@Override
	public int compareTo(NodeS o) {
		// TODO Auto-generated method stub
		if (this.cost>o.cost )
			return 1;
		else
		return 0;
	}
 
 
}
