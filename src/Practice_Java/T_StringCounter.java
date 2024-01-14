package Practice_Java;

import java.util.LinkedHashMap;
import java.util.Map;

public class T_StringCounter {

	public static void main(String[] args) {   //This line is the main method declaration, 
        String name = "teststring";  //This line declares a String variable named name and initializes it with the value "teststring". This is the input string from which we want to find duplicate characters.
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); //This line declares a map (specifically, a LinkedHashMap) to store characters as keys and their corresponding counts as values. The map will be used to keep track of the occurrences of each character in the name string.
		
		for (int i = 0; i < name.length()-1; i++) //This loop iterates over each character in the name string, from the first character (index 0) to the second-to-last character (index name.length()-1). It stops at the second-to-last character because the last character will be handled in the else block below.
		{
			char ch = name.charAt(i); //This line extracts the character at the current index i from the name string and stores it in a char variable called ch.
			if (map.get(ch) == null)  //{: If the character ch is not already present in the map (i.e., it's a new character encountered for the first time), the code enters this block.
			{
				map.put(ch, 1); //It puts the character ch as the key in the map with an initial count of 1.
			} 
			else //{: If the character ch is already present in the map (i.e., it's a duplicate character), the code enters this block.
			{
				map.put(ch, map.get(ch) + 1); //It increments the count of the character ch in the map by 1.
			}
			
			//System.out.println(map);
			//{t=3, e=1, s=2, r=1, i=1, n=1} have asel tr
		}
		
		
		
		System.out.println("Duplicate characters and their count:");//This code snippet iterates through each entry (key-value pair) in the map using the entrySet() method and checks if the count (value) of the character is greater than 1. If it is, it means the character is a duplicate. It then prints the duplicate character along with its count to the console.
		for (Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if (entry.getValue() > 1)
			{
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}
		
	
}


	        