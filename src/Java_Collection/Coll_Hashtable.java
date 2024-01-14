package Java_Collection;

import java.util.Hashtable;
import java.util.Map;

public class Coll_Hashtable {

	public static void main(String[] args) {
		// Create a new Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        hashtable.put("John", 25);
        hashtable.put("Emily", 30);
        hashtable.put("David", 42);
        hashtable.put("Alice", 35);

        // Accessing values from the Hashtable
        System.out.println("Age of John: " + hashtable.get("John"));
        System.out.println("Age of Alice: " + hashtable.get("Alice"));

        // Modifying values in the Hashtable
        hashtable.put("John", 26);
        System.out.println("Updated age of John: " + hashtable.get("John"));

        // Removing a key-value pair from the Hashtable
        hashtable.remove("Emily");
        System.out.println("Size of Hashtable after removal: " + hashtable.size());

        // Iterating over the Hashtable
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Checking if a key exists in the Hashtable
        boolean containsKey = hashtable.containsKey("David");
        System.out.println("Hashtable contains key 'David': " + containsKey);

        // Checking if a value exists in the Hashtable
        boolean containsValue = hashtable.containsValue(30);
        System.out.println("Hashtable contains value 30: " + containsValue);

        // Clearing the Hashtable
        hashtable.clear();
        System.out.println("Size of Hashtable after clearing: " + hashtable.size());	
	}

}
