package Practice_Java;

public class PracticeString {

	public static void main(String[] args) {
		String str="PramodNawale";
		
		/* String replacedStr = str.replace("Pramod", "Pravin");
	     System.out.println(replacedStr); */        //O/P=Pravin Nawale
		
		
		//System.out.println(str.charAt(11));     //1]CharAt() method.
		
		//System.out.println(str.length());       //2]Length() method.
		
		//System.out.println(str.toUpperCase());  //3]to Uppercase method.
		
		//System.out.println(str.toLowerCase());  //4] to lower case() method.
		
		//System.out.println(str.trim());		   //5] trim() method //space remove 
		
		//System.out.println(str.startsWith("P")); //6]StartsWith method()
		
		//System.out.println(str.endsWith("e"));      //7]ends with method
		
		/*int a = 10;                                // 8]value of //  O/P=1010
        String intStr = String.valueOf(a);
        System.out.println(intStr + 10);  */
		
		/*String s2="Pravin Nawale";              //9]equals() method   //O/P=false
		System.out.println(str.equals(s2)); */	
		
		//System.out.println(str.split(" "));
		
		
		String str1= new String("Amol");
		String str2= "Amol";
		System.out.println(str1==str2);               //false
		System.out.println(str1.equals(str2));       // true
		
		System.out.println(".........................");
		String str3="Pramod";
		String str4="Pramod";
		System.out.println(str3==str4);             // true
		System.out.println(str3.equals(str4));      // true
		
		System.out.println(".........................");
		String str5= new String("velocity");
		String str6= new String("velocity");
		System.out.println(str5==str6);                 //false
		System.out.println(str5.equals(str6));          //true

	}

}
