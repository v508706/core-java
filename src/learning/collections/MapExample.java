package learning.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		//Hash map is not thread safety // fast //from 1.2 // allow one null key 
		//Hash Table is thread safety // slow // from jave introduction // does not allow null key
		//Linked Hash Map used to maintains insertion order 
		// Tree Hash Map  is sorted
		
		Map<String, String> map = new HashMap<>();
		map.put("myName", "Mani");
		map.put("myLang", "Tamil");
		map.put("myCEO", "Borje");
		
		System.out.println(map);
		System.out.println(map.get("myName"));
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " " + map.get(key));
		}
		System.out.println("---------------------");
		
		Map<String, String> phonebook = new HashMap<>();
		phonebook.put("Mani", "98238473023");
		phonebook.put("Kish", "98232343210");
		phonebook.put("Bala", "90946236436");
		
		Set<Map.Entry<String, String>> mapEntries = phonebook.entrySet();
		for (Map.Entry<String, String> entry : mapEntries) {
			System.out.println(entry.getKey()+" : "+entry.getValue()); 
		}
		
	}

}
