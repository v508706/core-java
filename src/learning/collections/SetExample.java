package learning.collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		 //Set will have all unique elements, does not support duplicate element insertion 
		// Hash Set Not maintaining the sequence /order 
		
		Set<Integer> values = new HashSet<>();
		values.add(87);
		values.add(97);
		values.add(34);
		values.add(92);
		
		values.forEach(System.out::println);
		
		System.out.println(" ----------Ascending------------ ");
		// Tree set arranges in a order by default in asc order
		TreeSet<Integer> values2 = new TreeSet<>();
		values2.add(87);
		values2.add(97);
		values2.add(34);
		values2.add(92);
		
		values2.forEach(System.out::println);
		
		System.out.println(" ---------Descending------------- ");
		NavigableSet<Integer> ns = values2.descendingSet();
		for (Integer integer : ns) {
			System.out.println(integer);
		}

	}

}
