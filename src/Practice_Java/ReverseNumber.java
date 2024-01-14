package Practice_Java;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=123;
		int original_num=num;
		int rev=0;
		while(num>0) {
			
			rev=rev*10+num%10;    // 0*10+3=3     3*10+2=32         32*10+1=321
			num=num/10;           // 12           1                 0
			
		}
		System.out.println("Original number is:  "+original_num);
		System.out.println("Reverse number is: "+rev);
		
		if(original_num==rev) {
			System.out.println(original_num+" is palindrome number");
		}
		else
			System.out.println(original_num+" is not palindrome number");
	}

}
