package learning.important_problems;

import java.util.Stack;

public class SuperReducedString {
	
	public static void main(String[] args) {
		
		String str = "Chennei";
		
		Stack<String> stack = new Stack<>();
		
		char[] chars = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			if(!stack.isEmpty() && stack.peek().equals(chars[i]+"")) {
				stack.pop();
			}else {
				stack.push(chars[i]+""); // if stack is empty or current element is not same as top one
			}
		}
		
		System.out.println("Reduced String : ");
		if(stack.isEmpty()) {
			System.out.println("Empty");
		}
		
		for(int i=0; i<stack.size();i++) {
			System.out.print(stack.get(i)); 
		}
		
		/*
		 * while(!stack.isEmpty()) { System.out.print(stack.pop()); }
		 */
	}

}



/**if(stack.isEmpty()) {
stack.push(chars[i]+"");
}else {
if(stack.peek().equals(chars[i]+"")) {
	stack.pop();
}else {
	stack.push(chars[i]+"");
}
}*/
