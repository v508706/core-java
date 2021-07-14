package learning.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 3, 55, 13, -22 };
		for (int firstUnsortedPartitionIndex = 1; firstUnsortedPartitionIndex < intArray.length; firstUnsortedPartitionIndex++) {
			int newElement = intArray[firstUnsortedPartitionIndex];

			int sortedPartitionIndex;
			for (sortedPartitionIndex = firstUnsortedPartitionIndex; sortedPartitionIndex > 0
					&& intArray[sortedPartitionIndex - 1] > newElement; sortedPartitionIndex--) {
				intArray[sortedPartitionIndex] = intArray[sortedPartitionIndex-1];	
			}
			intArray[sortedPartitionIndex] = newElement; 

		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
