package learning.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort { 
 

public static void main(String[] args) {
			
			int[] intArray = {20,-1,30,3,55,13,37};
			
			for(int lastUnsortedIndex=intArray.length-1 ;lastUnsortedIndex>0; lastUnsortedIndex-- ) {
				int largestIndex = 0;
				for(int i=0; i<=lastUnsortedIndex; i++) {
					if(intArray[i]>intArray[largestIndex]) {
						largestIndex=i;
					}
				}
				swap(intArray, largestIndex, lastUnsortedIndex);
				 
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
 
