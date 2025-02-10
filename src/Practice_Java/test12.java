package Practice_Java;

import java.util.HashMap;

public class test12 {
	
  public static void main(String[] args) {
	
	  String s="welcome to yash welcome";
	  HashMap<String, Integer> hm= new HashMap<>();
	  String[] words=s.split(" ");
	  
	  for(String a: words) {
		 // System.out.println(a);   // prints words from array
		  
		  Integer integer=hm.get(a);
		  
		  if(integer==null) 
		  {
			  hm.put(a, 1);
		  }
		  else 
		  {
			  hm.put(a, integer+1);
		  }
	  }
	  System.out.println(hm);
}
}
