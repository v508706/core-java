package learning.hacker_rank.certificate.java_basic;

import java.util.Scanner;
import java.util.Stack;
 

public class BalancedString {
		
		public static void main(String[] args) {
		 
	        
			Scanner in = new Scanner(System.in);

			while (in.hasNext()) {
				System.out.println( isBalanced(in.next()));
			}
	        
			in.close();
		}
		
		 static String isBalanced(String s) 
		    {
		    	
		    	Stack<Character> st = new Stack<Character>();

		        for(char chr : s.toCharArray())
		        {
		            switch(chr) {

		                case '{':
		                case '(':
		                case '[':
		                    st.push(chr);
		                    break;

		                case ']':
		                    if(st.isEmpty() || st.pop() != '[') 
		                        return "false";
		                    break;
		                case ')':
		                    if(st.isEmpty() || st.pop() != '(')
		                        return "false";
		                    break;
		                case '}':
		                    if(st.isEmpty() || st.pop() != '{')
		                        return "false";
		                    break;
		            }
		        }
		        return st.isEmpty()?"true":"false";

		    }
	}


 
