package Practice_Java;

public class SeparateCharactersAndNumbers {

	public static void main(String[] args) {
		
		    
		        String str = "AJGTV159"; // initializes a string str with the value "AJGTV159".
		        StringBuilder letters = new StringBuilder(); //initializes a StringBuilder to hold the letter characters.
		        StringBuilder numbers = new StringBuilder(); //initializes a StringBuilder to hold the number characters.

		        for (char c : str.toCharArray()) //This for-each loop iterates over each character in the string str. The toCharArray() method converts the string into an array of characters.
		        {
		            if (Character.isDigit(c))  //if the character c is a digit (0-9). If true, it appends c to the numbers StringBuilder.
		            {
		                numbers.append(c);
		            }
		            else if (Character.isLetter(c)) //if the character c is a letter (a-z or A-Z). If true, it appends c to the letters StringBuilder.
		            {
		                letters.append(c);
		            }
		        }

		        System.out.println("Letters: " + letters.toString());
		        System.out.println("Numbers: " + numbers.toString());
		    }
		}


	/*  public class AppendExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        // Appending different types of data
        sb.append(" World");          // Appending String
        sb.append('!');               // Appending char
        sb.append(123);               // Appending int
        sb.append(45.67);             // Appending double
        
        System.out.println(sb.toString()); // Output: Hello World!12345.67
    }
}
        */


