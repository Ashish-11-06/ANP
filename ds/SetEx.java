package ds;
import java.util.*;
public class SetEx 
{

	public static void main(String[] args) 
	{
		
		Set<String> s=new HashSet<>();
		s.add("Paritosh");
		s.add("Murnmai");
		s.add("Nasrin");
		s.add("Amrish");
		s.add("Nasrin");
		s.add("Praveen");
		System.out.println(s);
	SortedSet<String> s1=new TreeSet<>();
		s1.add("Paritosh");
		s1.add("Murnmai");
		s1.add("Nasrin");
		s1.add("Amrish");
		s1.add("Nasrin");
		s1.add("Praveen");
		System.out.println(s1);
		
		        // Create a HashSet to store unique elements
		        Set<Integer> set = new HashSet<>();

		        // Adding elements to the set
		        set.add(10);
		        set.add(20);
		        set.add(30);
		        set.add(40);
		        set.add(50);
		        set.add(10); // Adding duplicate element (will be ignored)
//		        set.add(null);
		        // Print the set
		        System.out.println("Set: " + set);

		        // Check if set contains a specific element
		        System.out.println("Does set contain 30? " + set.contains(30)); // true
		        System.out.println("Does set contain 15? " + set.contains(15)); // false

		        // Remove an element from the set
		        set.remove(40);
		        System.out.println("Set after removing 40: " + set);

		        // Size of the set
		        System.out.println("Size of the set: " + set.size());

		        // Clear the set
		        set.clear();
		        System.out.println("Set after clearing: " + set);
		        System.out.println("Is set empty now? " + set.isEmpty()); // true
		        
//		        Uniqueness: Sets do not allow duplicate elements. When you attempt to add a duplicate element, it is ignored.
//
//		        Efficient Membership Testing: Sets provide constant-time performance for membership testing (contains() method). This allows you to efficiently check whether an element is present in the set.
//
//		        Addition and Removal: You can add elements to the set using the add() method. Similarly, you can remove elements using the remove() method.
//
//		        Size: The size() method returns the number of elements in the set.
//
//		        Clearing: The clear() method removes all elements from the set.
//
//		        Empty Check: The isEmpty() method checks whether the set is empty.
		        
		        Set<Integer> treeSet = new TreeSet<>();

		        // Adding elements to the TreeSet
		        treeSet.add(30);
		        treeSet.add(10);
		        treeSet.add(50);
		        treeSet.add(20);
		        treeSet.add(40);
		        treeSet.add(10); // Adding duplicate element (will be ignored)
//		        treeSet.add(null); //we cannnot add null values
		        
		        // Print the TreeSet (elements will be in sorted order)
		        System.out.println("TreeSet: " + treeSet);

		        // Check if TreeSet contains a specific element
		        System.out.println("Does TreeSet contain 30? " + treeSet.contains(30)); // true
		        System.out.println("Does TreeSet contain 15? " + treeSet.contains(15)); // false

		        // Remove an element from the TreeSet
		        treeSet.remove(40);
		        System.out.println("TreeSet after removing 40: " + treeSet);

		        // Size of the TreeSet
		        System.out.println("Size of the TreeSet: " + treeSet.size());

		        // Clear the TreeSet
		        treeSet.clear();
		        System.out.println("TreeSet after clearing: " + treeSet);
		        System.out.println("Is TreeSet empty now? " + treeSet.isEmpty()); // true
		        
//		        Sorted Order: TreeSet maintains its elements in sorted (ascending) order. When elements are added to the set, they are automatically sorted.
		   
//		        Efficient Membership Testing: TreeSet provides efficient membership testing (contains() method) and other set operations due to its underlying binary search tree data structure.
		        
		    }
}
		    
