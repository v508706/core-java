package learning.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample {
	
	public static void main(String[] args) {
		int a[] = new int[4];
		
		List<Integer> values = new ArrayList<>();
		values =  (List<Integer>) addNumbersToCollection(values);
		values.add(1,1);
		Comparator<Integer> com = (o1, o2)-> {
			return o2>o1?1:-1;
		};
		Collections.sort(values, com );
		
		//Collections.reverse(values);
		//System.out.println(values.toString());
		values.forEach(System.out::println);
	
		/*
		 * Iterator it = values.iterator();
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 * 
		 * for (Integer integer : values) { System.out.println(integer); }
		 */
		
		Set<Integer> setNumbers = new HashSet<>();
		setNumbers = (Set<Integer>) addNumbersToCollection(setNumbers);		
		System.out.println(setNumbers.toString());
		Iterator it2 = setNumbers.iterator();
		
		
		
		Set<Integer> treeSetNos = new TreeSet<>();
		treeSetNos = (Set<Integer>) addNumbersToCollection(treeSetNos);
		System.out.println(treeSetNos.toString());
		
		Map<Integer, String> hashMapValues = new HashMap<>();
		
		
	}
	
	
	private static Collection<Integer> addNumbersToCollection(Collection<Integer> numbers){
		numbers.add(9);
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		numbers.add(4);
		numbers.add(7);
		numbers.add(10);
		return numbers;
		
	}

}
