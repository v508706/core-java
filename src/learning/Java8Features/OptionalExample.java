package learning.Java8Features;

import java.util.Optional;

public class OptionalExample {  
	public static void main(String[] args) {  
		String[] str = new String[10];  
		//String lowercaseString = str[5].toLowerCase();  
		//System.out.print(lowercaseString);  
		//str[5] = "Mani";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		System.out.println(checkNull.isEmpty());
		System.out.println(checkNull.isPresent());
		checkNull.ifPresent(System.out::println);
	}  
}  