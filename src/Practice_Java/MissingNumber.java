package Practice_Java;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,11};
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of elements in array: " + sum1);

		int sum2 = 0;
		for (int i = 1; i <= 11; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("Sum of range of elements in array: " + sum2);
		System.out.println("Missing number is: " + (sum2 - sum1));
	}
}