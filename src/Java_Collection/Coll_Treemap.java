package Java_Collection;

import java.util.Map;
import java.util.TreeMap;

public class Coll_Treemap {

	public static void main(String[] args) {
		// Create a new TreeMap
        Map<String, Integer> treeMap = new TreeMap<String, Integer>();

        // Add key-value pairs to the TreeMap
        treeMap.put("John", 25);
        treeMap.put("Emily", 30);
        treeMap.put("David", 42);
        treeMap.put("Alice", 35);

        // Accessing values from the TreeMap
        System.out.println("Age of John: " + treeMap.get("John"));
        System.out.println("Age of Alice: " + treeMap.get("Alice"));

        // Modifying values in the TreeMap
        treeMap.put("John", 26);
        System.out.println("Updated age of John: " + treeMap.get("John"));

        // Removing a key-value pair from the TreeMap
        treeMap.remove("Emily");
        System.out.println("Size of TreeMap after removal: " + treeMap.size());

        // Iterating over the TreeMap
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Checking if a key exists in the TreeMap
        boolean containsKey = treeMap.containsKey("David");
        System.out.println("TreeMap contains key 'David': " + containsKey);

        // Checking if a value exists in the TreeMap
        boolean containsValue = treeMap.containsValue(30);
        System.out.println("TreeMap contains value 30: " + containsValue);

        // Clearing the TreeMap
        treeMap.clear();
        System.out.println("Size of TreeMap after clearing: " + treeMap.size());	

	}

}
