package Practice_Java;

public class Hundred {

	public static void main(String[] args) {
		int num=100;
		int result=0;
		
		while(num>0) {
			result=result*10+num%10;
			num=num/10;
		}
		System.out.println(result);

	}

}