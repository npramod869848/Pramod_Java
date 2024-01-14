package SDET_JAVA;

public class Swapping2Numbers {

	public static void main(String[] args) {
	
		int a=10, b=20;
		
		System.out.println("Before swapping values are.."+a+"  "+b);
		
		//Logic1-third variable
		
		/*int t=a;
		a=b;
		b=t; */
		
		
		//logic2- use + & - without using third variables
		a=a+b;  //10+20=30
		b=a-b;	//30-20=10
		a=a-b;	//30-10=20 
		
		//Logic3- use * and / without using third variables
		//here a & b values should not be zero
		
		/* a=a*b;  //10*20=200
		b=a/b;	//200/20=10
		a=a/b;	//200/10=20 */
		
		//Logic4- Single statement
		/* b=a+b-(a=b); */
		
		//Logic5 - bitwise XOR (^)
		/* a=a^b; //10^20=30
		b=a^b; //30^20=10
		a=a^b; //30^10=20 */
		
		
		System.out.println("After swapping values are.."+a+" "+b);
		
	}

}
