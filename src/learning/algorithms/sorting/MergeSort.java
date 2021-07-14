package learning.algorithms.sorting;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] intArray = {20,35,-15,7,55,1,-22};
		mergeSort(intArray, 0, intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	
	private static void mergeSort(int[] intArray, int start, int end) {
		 
		if(end-start<2) { // Break when it is single element in array
			return;
		}
		
		int mid = (start+end)/2;
		mergeSort(intArray, start, mid);
		mergeSort(intArray, mid, end);
		merge(intArray, start, mid, end);
	}

	private static void merge(int[] inputArray, int start, int mid, int end) {
		
		if(inputArray[mid-1]<=inputArray[mid]) { // indicates already sorted, so nothing to do
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex= 0;
		int[] tempArray = new int[end - start];
		
		while(i<mid && j <end) {
			tempArray[tempIndex++] = inputArray[i]<= inputArray[j] ? inputArray[i++]:inputArray[j++];
		}
		System.arraycopy(inputArray, i, inputArray, start+tempIndex, mid-i); // Copy Left over
		System.arraycopy(tempArray, 0, inputArray, start, tempIndex); // merge sorted temp array 

	}
}
