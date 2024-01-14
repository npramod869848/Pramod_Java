package Practice_Java;

public class PracticeFibonacci {

	public static void main(String[] args) {
		// Print the first 10 numbers in the Fibonacci series.// last two numbers addition
		int a = 0;
		int b = 1;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(b);
			int c = a + b;
			a = b;
			b = c;
		}
	}
}