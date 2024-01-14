package Practice_Java;

public class OneTwoHundredPrintEvenOddNumbersPrint {

	public static void main(String[] args) {
		// Print numbers from 1 to 100
		System.out.println("Numbers from 1 to 100:");
		for (int i = 1; i <= 100; i++) 
		{
			System.out.print(i + " ");
		}
		System.out.println(); // Print a new line after printing all numbers

		// Select even and odd numbers
		System.out.println("Even numbers:");
		for (int i = 1; i <= 100; i++) 
		{
			if (i % 2 == 0) 
			{
				System.out.print(i + " ");
			}
		}
		System.out.println(); // Print a new line after printing all even numbers

		System.out.println("Odd numbers:");
		for (int i = 1; i <= 100; i++) 
		{
			if (i % 2 != 0) 
			{
				System.out.print(i + " ");
			}
		}
	}


}


