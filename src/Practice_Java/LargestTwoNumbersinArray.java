package Practice_Java;

public class LargestTwoNumbersinArray {

	public static void main(String[] args) {
    int[] numbers = {5, 10, 15, 20, 25};
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int number : numbers) {
            largest = Math.max(largest, number);
        }
        
        for (int number : numbers) {
            if (number != largest) {
                secondLargest = Math.max(secondLargest, number);
            }
        }
        
        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);	

	}

}
