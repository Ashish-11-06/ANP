package ds;
import java.util.ArrayList;
import java.util.List;

public class ALex {


	public static void main(String[] args) {
        // Create an ArrayList to store elements
        List<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Mango");

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Accessing elements by index
        System.out.println("Element at index 2: " + arrayList.get(2));

        // Modify an element
        arrayList.set(3, "Pineapple");
        System.out.println("ArrayList after modifying: " + arrayList);

        // Removing an element by value
        arrayList.remove("Banana");
        System.out.println("ArrayList after removing 'Banana': " + arrayList);

        // Checking if ArrayList contains a specific element
        System.out.println("Does ArrayList contain 'Mango'? " + arrayList.contains("Mango"));

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + arrayList.size());

        // Clear the ArrayList
        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
        System.out.println("Is ArrayList empty now? " + arrayList.isEmpty()); // true
    }
}
