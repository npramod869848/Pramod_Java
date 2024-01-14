package Practice_Java;
import java.util.Scanner;

public class PalindromeNumber {

	public static boolean isPalindrome(int number) 
	{
		String str = Integer.toString(number);//It converts the integer into a string representation using Integer.toString(number).
		int left = 0;
		int right = str.length() - 1;////It initializes two pointers, left and right, pointing to the beginning and end of the string, respectively

		while (left < right) //It enters a while loop that continues as long as left is less than right.
		{
			if (str.charAt(left) != str.charAt(right)) 
			{
				return false;//Inside the loop, it compares the characters at the positions pointed to by left and right. If they are not equal, it immediately returns false as the number is not a palindrome.
			}
			left++; //If the characters are equal, it increments left and decrements right, effectively moving the pointers towards each other.
			right--;
		}

		return true; //If the loop completes without finding any unequal characters, it returns true, indicating that the number is a palindrome.
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		if (isPalindrome(number)) 
		{
			System.out.println(number + " is a palindrome number.");
		} 
		else 
		{
			System.out.println(number + " is not a palindrome number.");
		}
	}
}
