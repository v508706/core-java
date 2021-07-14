package learning.algorithms.sorting;

import java.util.Arrays;

public class BubbleSortArray {

	public static void main(String[] args) {
		
		int[] intArray = {20,-1,30,3,55,13,37};
		for(int unsortedPartitionLength=intArray.length-1 ;unsortedPartitionLength>0; unsortedPartitionLength-- ) {			
			for(int i=0; i<unsortedPartitionLength; i++) {
				if(intArray[i]>intArray[i+1]) {
					swap(intArray, i, i+1);
				}
				
			}
		}
		
		System.out.println(Arrays.toString(intArray));
		
		
	}
	
	public static void swap(int  arr[], int i, int j) {
		if(i==j)
			return;
		else {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j] = temp;
		}
		
		
	}
}
