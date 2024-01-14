package Java_Collection;

import java.util.ArrayList;

public class Coll_ArrayList {

	public static void main(String[] args) {
		  // Creating an ArrayList
        ArrayList<String> Name = new ArrayList<>();

        // Adding elements to the ArrayList
        Name.add("Apple");
        Name.add("Banana");
        Name.add("Orange");	
        // Accessing elements
        System.out.println("Name: " + Name);

        // Accessing an element by index
        String firstName = Name.get(0);
        System.out.println("First Name: " + firstName);

        // Modifying an element
        Name.set(1, "Mango");
        System.out.println("Modified Name: " + Name);

        // Removing an element
        Name.remove(2);
        System.out.println("Name after removal: " + Name);

        // Checking if an element exists//return true is a particular value is present.
        boolean containsBanana = Name.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        // Checking the size of the ArrayList
         int size = Name.size();
        System.out.println("Size of Name: " + size);

        // Iterating over the ArrayList
        System.out.print("Name (using iteration): ");
        for (String Names : Name) {
            System.out.print(Name + " ");
        }
        System.out.println();

        // Clearing the ArrayList
        Name.clear();
        System.out.println("Fruits after clearing: " + Name);

        // Checking if the ArrayList is empty
        boolean isEmpty = Name.isEmpty();
        System.out.println("Is Name empty? " + isEmpty);
	}

}
