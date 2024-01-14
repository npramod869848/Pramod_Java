package Java_Collection;

import java.util.TreeSet;

public class Coll_Treeset {

	public static void main(String[] args) {
		// Creating a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(10);

        // Displaying the TreeSet
        System.out.println("TreeSet: " + numbers);

        // Removing an element
        numbers.remove(2);
        System.out.println("TreeSet after removal: " + numbers);

        // Checking if an element exists
        boolean contains8 = numbers.contains(8);
        System.out.println("Contains 8? " + contains8);

        // Accessing the first and last elements
        int first = numbers.first();
        int last = numbers.last();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        // Size of the TreeSet
        int size = numbers.size();
        System.out.println("Size of TreeSet: " + size);

        // Iterating over the TreeSet
        System.out.print("TreeSet (using iteration): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Clearing the TreeSet
        numbers.clear();
        System.out.println("TreeSet after clearing: " + numbers);

        // Checking if the TreeSet is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is TreeSet empty? " + isEmpty);	
	}

}
