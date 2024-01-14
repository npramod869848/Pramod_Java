package Practice_Java;

public class PalindromeString {
	public static boolean Palindrome(String str)   //This is a method that takes a single argument, str, which is the input string to be checked for palindrome.
	{
		int left=0;    //This initializes the variable left to 0, representing the leftmost index of the string.
		int right=str.length()-1;  //This initializes the variable right to the last index of the string (str.length() - 1), representing the rightmost index of the string.

		while(left<right) //This starts a loop that continues as long as left is less than right. The loop runs until we reach the middle of the string.
		{
			if(str.charAt(left)!=str.charAt(right)) //This checks whether the characters at the left and right i ndices of the string are not equal. If they are not equal, it means the string is not a palindrome, and the method returns false.
			{
				return false;
			}
			left++;   // In each iteration of the loop, we increment left and decrement right, effectively moving closer to the middle of the string.
			right--;
		}
		return true;	//If the loop finishes execution without returning false, it means all the characters in the string matched (from both ends towards the middle), making it a palindrome. In this case, the method returns true.
	}
	public static void main(String[]args) 
	{
		String str="nitin";
		if(Palindrome(str)) 
		{
			System.out.println(str+" is Palindrome");
		}
		else
		{
			System.out.println(str+" Not Palindrome"); 
		}
	}
}
