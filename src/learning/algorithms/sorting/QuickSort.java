package learning.algorithms.sorting;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] intArray = {20,35,-15,7,55,1,-22};
		 quickSort(intArray, 0, intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	
	public static void quickSort(int[] intArray, int start, int end) {
		
		if(end-start<2) {
			return; //Breaking condition when it is single element
		}
		
		int pivotIndex = partition(intArray, start,end);
		quickSort(intArray, start, pivotIndex);
		quickSort(intArray, pivotIndex+1, end);
	}
	
	public static int partition(int[] intArray, int start, int end) {
		
		int i = start;
		int j = end;
		int pivot = intArray[start]; //first element as pivot
		while(i<j) { // until i and j cross each other
		
			while(i<j && intArray[--j]>=pivot); // Empty loop to skip the correct elements
			
			if(i<j) {
			intArray[i] = intArray[j];
			}
			
			while(i<j && intArray[++i]<=pivot); // Empty loop to skip correct elements
			if(i<j) {
				intArray[j] = intArray[i];
			}
			
			 
		}
		intArray[j] = pivot;
		return j;
	}

}

