package Practice_Java;

public class RvrsestrngusingCharArray {

    public static void main(String[] args) {
        String str = "Hello Pramod";
        
        // Convert the string to a character array
        char a [] = str.toCharArray();
        int length = a.length;
        String rev = "  ";                                 // Initialize the 'rev' variable
        
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + a[i];
        }
        
        System.out.println("Reversed string is: " + rev);
    }
}
