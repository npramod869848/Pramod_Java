package Java_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Coll_LinkedList {

	public static void main(String[] args) {
		 LinkedList<String> LL=new LinkedList<String>();  
		  LL.add("Ravi");  
		  LL.add("Vijay");  
		  LL.add("8275256568");
		  LL.add("Ravi");  
		  LL.add("Null");
		  LL.add("Ajay");
		  LL.add("Ajay");
		  LL.remove("8275256568");
		  
		  int size = LL.size();
	      System.out.println("Size of LL: " + size);

		  Iterator<String> itr=LL.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  
		  }  
		 }  
}

		
