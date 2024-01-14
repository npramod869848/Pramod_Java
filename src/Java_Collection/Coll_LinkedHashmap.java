package Java_Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class Coll_LinkedHashmap {

	public static void main(String[] args) {
		 // Create a new LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        linkedHashMap.put("John", 25);
        linkedHashMap.put("Emily", 30);
        linkedHashMap.put("David", 42);
        linkedHashMap.put("Alice", 35);

        // Accessing values from the LinkedHashMap
        System.out.println("Age of John: " + linkedHashMap.get("John"));
        System.out.println("Age of Alice: " + linkedHashMap.get("Alice"));

        // Modifying values in the LinkedHashMap
        linkedHashMap.put("John", 26);
        System.out.println("Updated age of John: " + linkedHashMap.get("John"));

        // Removing a key-value pair from the LinkedHashMap
        linkedHashMap.remove("Emily");
        System.out.println("Size of LinkedHashMap after removal: " + linkedHashMap.size());

        // Iterating over the LinkedHashMap
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Checking if a key exists in the LinkedHashMap
        boolean containsKey = linkedHashMap.containsKey("David");
        System.out.println("LinkedHashMap contains key 'David': " + containsKey);

        // Checking if a value exists in the LinkedHashMap
        boolean containsValue = linkedHashMap.containsValue(30);
        System.out.println("LinkedHashMap contains value 30: " + containsValue);

        // Clearing the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("Size of LinkedHashMap after clearing: " + linkedHashMap.size());	

	}

}
