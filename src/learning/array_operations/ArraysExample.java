package learning.array_operations;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysExample {

		public static void main(String[] args) {
			
			String[] strArry = {"One","Two","Threee"};
			for (int i = 0; i < strArry.length; i++) {
				System.out.println("Index "+i+" : "+strArry[i]);
			}
			
			System.out.println(Arrays.toString(strArry));
			
			LinkedList<Integer> intArray = new LinkedList<Integer>(); 
			intArray.add(1);
			intArray.add(2);
			intArray.add(3);
			intArray.forEach(elem->System.out.println("from for each: "+elem));
			
			intArray.forEach(System.out::println);
			
		}
}
