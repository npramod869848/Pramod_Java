package Java_Collection;

import java.util.HashMap;
import java.util.Map;

public class Coll_HashMap {

	public static void main(String[] args) {
		// Create a new HashMap
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        // Add key-value pairs to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Emily", 30);
        hashMap.put("David", 42);
        hashMap.put("Alice", 35);

        // Accessing values from the HashMap
        System.out.println("Age of John: " + hashMap.get("John"));
        System.out.println("Age of Alice: " + hashMap.get("Alice"));

        // Modifying values in the HashMap
        hashMap.put("John", 26);
        System.out.println("Updated age of John: " + hashMap.get("John"));

        // Removing a key-value pair from the HashMap
        hashMap.remove("Emily");
        System.out.println("Size of HashMap after removal: " + hashMap.size());

        // Iterating over the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Checking if a key exists in the HashMap
        boolean containsKey = hashMap.containsKey("David");
        System.out.println("HashMap contains key 'David': " + containsKey);

        // Checking if a value exists in the HashMap
        boolean containsValue = hashMap.containsValue(30);
        System.out.println("HashMap contains value 30: " + containsValue);

        // Clearing the HashMap
        hashMap.clear();
        System.out.println("Size of HashMap after clearing: " + hashMap.size());	

	}

}
