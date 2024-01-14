package Practice_Java;

public class RvrsestrngusingConc {

    public static void main(String[] args) {
        String str = "PramodNawale";
        String rev = ""; //An empty string rev is initialized to store the reversed version of the input string.

     /*The length variable is assigned the length of the input string using the length() method of the String class.*/
       int length = str.length();
        
 /*A for loop is used to iterate through the characters of the input string in reverse order. 
  It starts from the last character (index length - 1) and goes backwards to the first character (index 0).*/ 
        
        for (int i = length - 1; i >= 0; i--) 
        	
 /*Inside the loop, the charAt(i) method is used to retrieve the character at the current index i, and this character is concatenated to the rev string.
 This effectively builds the reversed string character by character. */     	
        {
            rev = rev + str.charAt(i);//After the loop finishes, the rev string now contains the reversed version of the input string.
        }

        System.out.println("Reversed string: " + rev);
    }
    
}