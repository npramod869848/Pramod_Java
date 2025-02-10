package Practice_Java;

public class CharacterSwapping {

	public static void main(String[] args) 
		{
		    String input = "Testing";
	        String output = swapCharacters(input);//swapCharacters method is called with input as an argument, and its result is stored in the output variable.
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);
	    }

	    public static String swapCharacters(String input)//swapCharacters method takes a String parameter input and returns a new String with adjacent characters swapped.
	    {
	        char[] chars = input.toCharArray();//input.toCharArray() converts the input string to a character array chars.
	        
	        for (int i = 0; i < chars.length - 1; i += 2)// (i += 2), ensuring only adjacent characters are swapped.
	        {
	            char temp = chars[i]; //character at index i is stored in a temporary variable temp.
	            chars[i] = chars[i + 1]; //character at index i is replaced with the character at index i + 1.
	            chars[i + 1] = temp; //character at index i + 1 is replaced with the character stored in temp.
	        }

	        return new String(chars);//creates a new string from the modified character array and returns it.
	    }
}
	

	