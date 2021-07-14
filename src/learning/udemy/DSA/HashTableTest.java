package learning.udemy.DSA;

import java.util.HashMap;

public class HashTableTest {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map= new HashMap<>();
		map.remove(map);
		
		String a = "Mani";
		System.out.println(a.hashCode());
		System.out.println(a.hashCode());
	}

}
