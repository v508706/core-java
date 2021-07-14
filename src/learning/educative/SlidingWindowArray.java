package learning.educative;

import java.util.Arrays;

public class SlidingWindowArray {
	
	public static double[] findAverage(int[] arr, int k) {
		
		double[] result = new double[arr.length-k+1];
		int windowStart = 0;	
		double windowSum = 0;
		for(int windowEnd=0;windowEnd<arr.length; windowEnd++ ) {
			windowSum+=arr[windowEnd]; //Sum
			if(windowEnd>=k-1) { //Slide only after the window reach the K
				result[windowStart] = windowSum/k; // Average
				windowSum-=arr[windowStart]; // Subtract the element going out 
				windowStart++; // Silde window
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		double[] result = findAverage(new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
		System.out.println(Arrays.toString(result));
	}
}

 