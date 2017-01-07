package collection.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

 
public class HashSetClass {

	public static void main(String args[]){  
		   
		  HashSet<String> al=new HashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		  
		  System.out.println("linked hash set");
		  // linked
		  LinkedHashSet<String> al2=new LinkedHashSet<String>();  
		  al2.add("Bavi");  
		  al2.add("Cijay");  
		  al2.add("Bavi");  
		  al2.add("Ajay");  
		  
		  Iterator<String> itr2=al2.iterator();  
		  while(itr2.hasNext()){  
		   System.out.println(itr2.next());  
		  }  
		 } 
	  
}
