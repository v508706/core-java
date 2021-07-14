package learning.collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		// Array List -> Dynamic Array, addition and removal is time consuming to update all impacted elements  
						// Fast for retrival and slow for insertion
		// Linked List -> Double Linked List,  addition and removal is fast because no need to update all other elements
						// Fast for insertion and slow for retrival
		
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(2);
		ll.add(4);
		ll.add(1,3);
		System.out.println(ll.getFirst());
	}

}
