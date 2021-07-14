package learning.important_problems;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		//Isomorphic => egg:add , paper:title, add:foo
		// bar:add
		System.out.println(isIsomorphic("bar", "add"));

	}

	public static boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length())
			return false;

		HashMap<Character, Character> map = new HashMap<>(s.length());

		for (int i = 0; i < s.length(); i++) {
			char sourceChar = s.charAt(i);
			char targetChar = t.charAt(i);
			if(map.containsKey(sourceChar)) { 
				if(map.get(sourceChar)!=targetChar) return false; // map contain key with different value 
			}else {
				if(map.containsValue(targetChar)) //// map contain value with different key  
					return false;
				else
					map.put(sourceChar, targetChar); //map does not contain both , so add it
			}
		}

		return true;
	}
}

 