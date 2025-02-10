package Practice_Java;

public class T_SwappingNumber {

	public static void main(String[] args) {
		    int a =0;
	        int b =1;
	        
	        System.out.println("Before Swapping Values: "+a+" "+b);
	      
	        // 1]Swapping logic//with third variables
	        // a and b variable chi value temp madhe store kli ahe.
	        int temp = a;
	        a = b;
	        b = temp;
	        
	        
	       /*2]Swapping logic//without third variables
	        a=a+b;  //0+1=1
	        b=a-b;	//1-1=0
	        a=a-b;  //1-0=1 */
	        
	        System.out.println("After Swapping Values: "+a+" "+b);
	}
}
