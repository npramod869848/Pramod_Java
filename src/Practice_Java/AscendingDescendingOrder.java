package Practice_Java;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingDescendingOrder 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer>alist=new ArrayList<Integer>();
		alist.add(9);
		alist.add(7);
		alist.add(1);
		alist.add(3);
		
		System.out.println("Default order:"+alist);
		Collections.sort(alist);
		System.out.println("Ascending order:"+alist);
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println("Descending order:"+alist);

	}

}
