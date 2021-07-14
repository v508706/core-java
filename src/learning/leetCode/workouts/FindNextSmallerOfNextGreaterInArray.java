package learning.leetCode.workouts;

import java.util.Stack;

public class FindNextSmallerOfNextGreaterInArray {
	public static void nextGreater(int arr[], int next[], char order) {
		Stack<Integer> stack = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && ((order == 'G') ? arr[stack.peek()] <= arr[i] : arr[stack.peek()] >= arr[i]))
				stack.pop();

			if (!stack.isEmpty())
				next[i] = stack.peek();
			else
				next[i] = -1;

			stack.push(i);
		}
	}

	public static void nextSmallerOfNextGreater(int arr[]) {
		int NG[] = new int[arr.length];
		int RS[] = new int[arr.length];

		nextGreater(arr, NG, 'G');

		nextGreater(arr, RS, 'S');

		for (int i = 0; i < arr.length; i++) {
			if (NG[i] != -1 && RS[NG[i]] != -1)
				System.out.print(arr[RS[NG[i]]] + " ");
			else
				System.out.print("-1 ");
		}
	}

	public static void main(String args[]) {
		int arr[] = { 5, 1, 9, 2, 5, 1, 7 };
		nextSmallerOfNextGreater(arr);
	}

}
