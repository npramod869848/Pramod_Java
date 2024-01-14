package Java_Collection;

import java.util.HashSet;

public class Coll_HashSet {

	public static void main(String[] args) {
		// Creating a HashSet
		HashSet<String> names = new HashSet<>();

		// Adding elements to the HashSet
		names.add("Alice");
		names.add("Pramod");
		names.add("Bob");
		names.add("Charlie");
		names.add("Alice"); // Adding duplicate element (ignored)

		// Displaying the HashSet
		System.out.println("HashSet: " + names);

		// Removing an element
		names.remove("Bob"); 
		System.out.print("HashSet (using iteration): ");
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();

		// Checking the size of the HashSet
		int size = names.size();
		System.out.println("Size of Name: " + size);
		
		
		// Checking if an element exists//return true is a particular value is present.
        boolean containsCharlie = names.contains("Charlie");
        System.out.println("Contains Charlie? " + containsCharlie);

		// Clearing the HashSet
		names.clear();
		System.out.println("HashSet after clearing: " + names);

		// Checking if the HashSet is empty
		boolean isEmpty = names.isEmpty();
		System.out.println("Is HashSet empty? " + isEmpty);	
	}

}
