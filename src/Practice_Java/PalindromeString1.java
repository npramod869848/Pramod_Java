package Practice_Java;

public class PalindromeString1 {

	public static void main(String[] args) {
		
		String str="nitin";
		
		String original_str=str;
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String: "+rev);
		
		if(original_str.equals(str)) {
			System.out.println(original_str+" is palindrome");
		}
		else {
			System.out.println(original_str+" is not palindrome");
		}

	}

}
