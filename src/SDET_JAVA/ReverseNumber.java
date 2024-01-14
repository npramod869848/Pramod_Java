package SDET_JAVA;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt(); //1234   //78910

		//1.using algorithm

		int rev=0; //(rev is temporary variable)

		while(num!=0)
		{
			rev=rev*10+num%10; //0*10+1234%10=4   //4*10+123%10=43  //43*10+12%10=432   //432*10+1%10=4321
			num=num/10; 	  //1234/10;         //123/10=12       //12/10=1           // 1/10=0  


			//rev=rev*10+num%10;  //0*10+78910%10=0   // 0*10+7891%10=01  //1*10+789%10=019  //190+78%10=0198   //01980+7%10=01987  
		//	num=num/10;        //78910/10=7891;    //7891/10=789	   //789/10=78        //78/10=7          //7/10=0
			
			
		}   
		System.out.println("Reverse number is: " + rev);


		//2.using stringbuffer class

		//StringBuffer rev; //(rev is variables)
		//convert number into string format.then store in variables sb

		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
	StringBuffer rev=sb.reverse(); */


		//3.using StringBuilder class

		/*StringBuilder sbl=new StringBuilder();
	sbl.append(num);
	StringBuilder rev=sbl.reverse();

		System.out.println("Reverse number is: " + rev); */
	}

}
