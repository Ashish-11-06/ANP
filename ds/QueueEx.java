package ds;
import java.util.*;

public class QueueEx {

	void dequeex() 
	{
		Deque<String> d=new ArrayDeque<String>();
		d.add("1");
		d.add("2");
		d.add("3");
		System.out.println(d);
		
		d.addFirst("0");
		d.addLast("4");
		System.out.println(d);
	}

	public static void main(String[] args) {
		Queue<String> queue1 = new LinkedList<>();
		QueueEx qe=new QueueEx();
		qe.dequeex();
		
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("ABC");
		pq.add("EFG");
		pq.add("HIJ");
		System.out.println(pq);
		
		System.out.println("Head:"+pq.element());
		System.out.println("Head:"+pq.peek());
		
	/*	Iterator itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
//	pq.remove(); // works like pq.poll
	pq.poll();
	System.out.println(pq);

	


     // Adding elements to the queue
     queue1.add("Alice");
     queue1.add("Bob");
     queue1.add("Charlie");
  // Adding more elements to the queue
     queue1.offer("Eva");
     // Printing the elements of the queue
     System.out.println("Elements of the queue: " + queue1);

     // Removing an element from the front of the queue
     String removedElement = queue1.remove();
     System.out.println("Removed element: " + removedElement);
     System.out.println("Updated queue: " + queue1);

     // Adding another element
     queue1.add("David");
     System.out.println("Updated queue after adding 'David': " + queue1);

     // Peek the front element without removing it
     String peekedElement = queue1.peek();
     System.out.println("Peeked element: " + peekedElement);
     System.out.println("Queue after peek operation: " + queue1);

     // Check if the queue is empty after removal
     System.out.println("Is the queue empty? " + queue1.isEmpty());


	}

}