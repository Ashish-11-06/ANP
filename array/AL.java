package array;

import java.util.*;

public class AL {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		//generic
		List<Integer> al=new ArrayList<>();
		List<Integer> al1=new ArrayList<Integer>();
//		ArrayList<String> al3=new ArrayList<>();
		//non generic
		@SuppressWarnings("rawtypes")
		List al2=new ArrayList<>();
		
		
		al2.add(1);
		al2.add("java");
		al2.add(22.9);
		al2.add('f');
		System.out.println(al2);
		
		al.add(10);
		al.add(15);
		al.add(5);
		al1.add(30);
		al1.add(25);
		System.out.println("Before add:"+al.size());
		
		al.addAll(al1);
		System.out.println("After add:"+al.size());
		
		int x=al.remove(4);
		System.out.println("After remove:"+al.size());
		System.out.println(al);
		System.out.println(al1);
		System.out.println("Removed number:"+x);
		System.out.println("Position 2:"+al.get(2));
		
		al.set(1, 50);
		Iterator<Integer> i=al.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}

		
		System.out.println();
		System.out.println("Before sort:"+al);
		
		al.sort(Comparator.naturalOrder());//asc order
		System.out.println("After sort:"+al);
		
		al.sort(Comparator.reverseOrder());//desc order
		System.out.println("After sort reverse:"+al);
		
		System.out.println(al1);
		al1.removeAll(al1);
		System.out.println(al1);
		
		al.clear();
		System.out.println(al);
	}

}