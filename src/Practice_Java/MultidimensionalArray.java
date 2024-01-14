package Practice_Java;

import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int[][] a = new int[3][3];         // Modify size to 3x3
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");

		for (int i = 0; i < 3; i++)     // rows
		{
			for (int j = 0; j < 3; j++) // columns
			{
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matrix:");
		for (int i = 0; i < 3; i++)
		{	
			for (int j = 0; j < 3; j++) 
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}



}


