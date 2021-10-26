package collection.com;
import java.util.*;
import java.util.Scanner; 
public class VectorExample {
      public static void main(String args[]) {
      Vector<String> vec = new Vector<String>(2);

      /* Adding elements to a vector*/
      vec.addElement("Apple");
      vec.addElement("Orange");
      vec.addElement("kivi");
      vec.addElement("banana");

      
      System.out.println("Size is:"+vec.size());
      System.out.println("Default capacity increment is: "+vec.capacity());

      vec.addElement("fruit1");
      vec.addElement("fruit2");
      vec.addElement("fruit3");

      /*size and capacityIncrement after two insertions*/
      System.out.println("Size after addition: "+vec.size());
      System.out.println("Capacity after increment is: "+vec.capacity());

      /*Display Vector elements*/
      Enumeration en = vec.elements();
      System.out.println("Elements are:");
      while(en.hasMoreElements())
         System.out.println(en.nextElement() + " ");
   }
   Vector<String> vectask = new Vector<String>(2);

 
}
