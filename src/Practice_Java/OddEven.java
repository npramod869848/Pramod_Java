package Practice_Java;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		//Check the given number odd or even
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number: ");
		int num =sc.nextInt();
		if(num%2==0) 
		{
			System.out.println("GIven num is Even");	
		}
		else 
		{		
			System.out.println("GIven num is Odd");
		}
		
		/*System.out.println("Even numbers: ");
		
		for(int i =1;i<=100;i++) 
		{
			if(i%2==0) 
			{
				System.out.print(i +" ");	
			}
			
		}
		System.out.println();
		
		System.out.println("Odd numbers: ");
		for(int i =1;i<=100;i++) 
		{
			if(i%2==1) 
			{
				System.out.print(i +" ");
			}  
			
		}*/
	}

}
