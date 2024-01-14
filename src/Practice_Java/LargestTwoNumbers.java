package Practice_Java;

public class LargestTwoNumbers {

	public static void main(String[] args) {
		
	        int a = 51;
	        int b = 505;
	        int c = 555;

	        int max = (a > b) ? a : b; // Assign the larger of a and b to max
	        int secondMax = (a > b) ? b : a; // Assign the smaller of a and b to secondMax
            
	        if (c > max) 
	        {
	            secondMax = max;
	            max = c;
	        }
	        else if (c > secondMax) 
	        {
	            secondMax = c;
	        }

	       
	        
	        System.out.println("The largest number is: " + max);
	        System.out.println("The second largest number is: " + secondMax);
	    }
	}	
	


