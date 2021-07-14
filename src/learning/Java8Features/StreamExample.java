package learning.Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);
        
        //A new java.util.stream has been added in Java 8 to perform filter/map/reduce like operations with the collection.
        //Stream API will allow sequential as well as parallel execution
        //Collection interface has been extended with stream() and parallelStream() default methods to get the
        //Notice that parallel processing values are not in order, so parallel processing will be very helpful while working with huge collections.
        myList.stream().filter(p->p>90).forEach(p->System.out.println(p));
        myList.parallelStream().filter(p->p>90).forEach(p->System.out.println(p));
        


        Stream<Integer> stream = Stream.of(new Integer[]{1,2,3,4}); 
        //works fine

        //Stream<Integer> stream1 = Stream.of(new int[]{1,2,3,4}); 
        //Compile time error, Type mismatch: cannot convert from Stream<int[]> to Stream<Integer> it doesn’t support autoboxing, so we can’t pass primitive type array.
        
        
        Stream<Integer> intStream = Stream.of(1,2,3,4);
        List<Integer> intList = intStream.collect(Collectors.toList());
        System.out.println(intList); //prints [1, 2, 3, 4]

        intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again
        Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
        System.out.println(intMap); //prints {1=11, 2=12, 3=13, 4=14}
        
        
        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        System.out.println(names2.sorted().collect(Collectors.toList()));
        
        names2 = Stream.of("aBc", "d", "ef", "123456"); //NOTE: stream is closed, so we need to create it again
        System.out.println(names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        

		Stream<String> names = Stream.of("aBc", "d", "ef");
		System.out.println(names.map(s -> {
				return s.toUpperCase();
			}).collect(Collectors.toList()));
		//prints [ABC, D, EF]
		
		
	
		Stream<List<String>> namesOriginalList = Stream.of(
			Arrays.asList("Pankaj"), 
			Arrays.asList("David", "Lisa"),
			Arrays.asList("Amit"));
		//flat the stream from List<String> to String stream
		Stream<String> flatStream = namesOriginalList
			.flatMap(strList -> strList.stream());
		
		flatStream.forEach(System.out::println);

		
	
		Stream<Integer> numbers3 = Stream.of(1,2,3,4,5);
		System.out.println("## Stream contains 4? "+numbers3.anyMatch(i -> i==4));
		//Stream contains 4? true
		
		Stream<Integer> numbers4 = Stream.of(1,2,3,4,5);
		System.out.println("##  Stream contains all elements less than 10? "+numbers4.allMatch(i -> i<10));
		//Stream contains all elements less than 10? true
		
		Stream<Integer> numbers5 = Stream.of(1,2,3,4,5);
		System.out.println("##  Stream doesn't contain 10? "+numbers5.noneMatch(i -> i==10));
		//Stream doesn't contain 10? true
	


	}

}
