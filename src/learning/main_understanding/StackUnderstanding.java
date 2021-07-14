package learning.main_understanding;

import java.util.Stack;

public class StackUnderstanding {

	public static void main(String[] args) {
		int arr[] = { 5, 7, 9, 8, 6, 1, 7,4 };
		int op[] = new int[arr.length];
		// next greatest element;
		
		Stack<Integer> stack = new Stack<>();
		for(int i=arr.length-1; i>=0;i--) {
			 
			while(!stack.isEmpty() && arr[i] >=stack.peek() ) {
					stack.pop();
				 
			}
			 
			if(!stack.isEmpty()) {
				op[i]= stack.peek();
			}else {
				op[i] = -1;
			}
			stack.push( arr[i]);
			System.out.println("Staging :"+arr[i]+" - > "+stack);
			
		} 
		
		System.out.println("OUTPUT");
		for(int j=0; j<op.length; j++) {
			System.out.println(arr[j] + "-> "+op[j]);
		}
	}
}
