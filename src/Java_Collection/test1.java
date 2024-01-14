package Java_Collection;

import java.util.ArrayList;

public class test1 {

    public static void main(String[] args) {
        ArrayList<String> Name = new ArrayList<>();

        Name.add("Pramod");
        Name.add("ashok");
        Name.add("tung");
        Name.add("Pune");

        System.out.println("Name list: " + Name);

        String thirdnm = Name.get(3);
        System.out.println("thirdnm: " + thirdnm);

        Name.set(0, "Mr.pramod");
        System.out.println("modified Name: " + Name);

        Name.remove(2);
        System.out.println("Name list number after removal: " + Name.size() + " Namelist: " + Name);

        // Commented out because it causes an error, 'Name' is not in scope here.
        // boolean containPramod = Name.contains("Pramod");
        // System.out.println("contains Pramod? " + containPramod);

        int size = Name.size();
        System.out.println("size of Name: " + size);

        System.out.println("Name (using iteration): ");
        for (String names : Name) {
            System.out.println(names + " ");
        }
        System.out.println();

        Name.clear();
        System.out.println("after clearing: " + Name);

        boolean isEmpty = Name.isEmpty();
        System.out.println("is name empty? " + isEmpty);
    }
}
