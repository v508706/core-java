package learning.collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Array List extends by 50% , // not thread safe, // fast 
		 Vector<Integer> v = new Vector<>(); // extends by 100% // synchronized, thread safe // since thread safe,this is slow.
		 //Vector is from 1.1 itselfa nd Array List is from 1.2 only which is latest and updated
		 v.add(4);
		 v.add(7);
		 v.add(6);
		 v.add(7);
		 v.add(8);
		 v.add(2);
		 v.add(4);
		 v.add(42);
		 v.add(8);
		 v.add(5);
		 v.add(1);
		 v.add(9);
		 v.add(2);
		 v.add(4);
		 v.add(42);
		 v.add(8);
		 v.add(5);
		 v.add(1);
		 v.add(9);
		 v.add(2);
		 v.add(4);
		 v.add(42);
		 v.add(8);
		 v.add(5);
		 v.add(1);
		 v.add(9);
		 v.add(2);
		 v.add(4);
		 v.add(42);
		 v.add(8);
		 v.add(5);
		 v.add(1);
		 v.add(9);
	
		 System.out.println(v.capacity());
		 
		 for (Integer integer : v) {
			System.out.println(integer);
		}
	
	}

}
