package Practice_Java;

public class DuplicateCommonElement 
{

	public static void main(String[] args) 
	{
		int[] a = {1, 2, 2, 3, 4, 5};
		
		for(int i = 0; i < a.length-1; i++) //The outer loop uses the variable i to iterate through the array indices from 0 to the length of the array minus one.
		{
			for(int j = i + 1; j < a.length; j++) //The inner loop uses the variable j to iterate through the array indices starting from i + 1 to the end of the array.
			{
				if(a[i] == a[j]) //If the two elements are equal, it means a duplicate element has been found.
				{
					System.out.println("Duplicate element: " + a[j]);
				}
			}
		}
	}
}
