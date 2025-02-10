package Practice_Java;

public class LargestTwoNumbers {

	public static void main(String[] args) {
		
	        int a = 51;
	        int b = 505;
	        int c = 555;

	        int max = (a > b) ? a : b; // This line uses a ternary operator to assign the larger value between a and b to max.
	        int secondMax = (a > b) ? b : a; // This line uses a ternary operator to assign the smaller value between a and b to secondMax.
            
	        if (c > max) //If c is greater than max, the current max value is assigned to secondMax, and c becomes the new max.
	        {
	            secondMax = max;
	            max = c;
	        }
	        else if (c > secondMax) //If c is not greater than max but is greater than secondMax, c is assigned to secondMax.
	        {
	            secondMax = c;
	        }

	       
	        
	        System.out.println("The largest number is: " + max);
	        System.out.println("The second largest number is: " + secondMax);
	    }
	}	
	


