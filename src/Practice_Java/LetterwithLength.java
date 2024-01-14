package Practice_Java;

public class LetterwithLength {

	public static void main(String[] args) {
    String str = "Pramod Nawale";
        
        System.out.println("Original String: " + str);
        
        int length = str.length();
        System.out.println("Length of the String: " + length);
        
        System.out.print("Capital letters: ");
        for (int i = 0; i < length; i++)
           {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
        
        System.out.print("Small letters: ");
        for (int i = 0; i < length; i++)
            {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.println();	
	}

}
