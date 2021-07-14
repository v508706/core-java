package learning.hacker_rank.interview_prep_kit.stackAndQueue;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		System.out.println(isBalanced(a));
	}

	//([{}(())
	
	private static boolean isBalanced(String ip) {

		HashMap<Character, Character> map = new HashMap<>();
		map.put(']', '[');
		map.put('}', '{');
		map.put(')', '(');

		Stack<Character> s = new Stack<>();
		for (int i = 0; i < ip.length(); i++) {
			char c = ip.charAt(i);
			if (s.isEmpty() || !s.isEmpty() && !map.containsKey(c) ) {
				s.push(c);
			} else {
				System.out.println(c+"->"+s.peek() + " -> " + map.get(c));
				if (!s.isEmpty() && s.peek() == map.get(c)) {
					
					s.pop();
				} else {
					return false;
				}
			}

		}	
		if(s.isEmpty())
			return true;
		else
			return false;
	}

}
