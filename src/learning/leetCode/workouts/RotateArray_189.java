package learning.leetCode.workouts;

import java.util.Arrays;

public class RotateArray_189 {
	//Right rotate
	public static void main(String[] args) {

		int[] nums = {1,2,3,4,5,6,7};
		int rotations = 3;
		rotate(nums,rotations);
		
		System.out.println(Arrays.toString(nums));
	}

	public static void rotate(int[] nums, int k) {
		
		int length = nums.length;
		k%=length;
		reverse(nums, 0, length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, length-1);
				
	}
	
	private static void reverse(int nums[], int start, int end) {
		while(start<end) {
			int tmp = nums[start];
			nums[start] = nums[end];
			nums[end]= tmp;
			start++;
			end--;
		}
		
	}

}
