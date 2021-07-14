package learning.algorithms.sorting;

public class RadixSort {

	public static void main(String[] args) {
		int[] intArray = { 1330, 8792, 1594, 4725, 4586, 5729};
		 radixSort(intArray, 10, 4);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	
	public static void radixSort(int[] input, int radix, int width) {
		for(int i=0 ; i<width; i++) {
			radixSingleSort(input, i, radix);
		}
	}
	
	public static void radixSingleSort(int[] input, int position, int radix) {
		int numLength = input.length;
		
		int[] countArray = new int[radix];
		
		for(int value : input) {
			countArray[getDigit(position, value, radix)]++;
		}
		
		//Adjust the count array 
		for(int j=1; j<radix;j++) {
			countArray[j] += countArray[j-1];
		}
		
		//int[] intArray = { 1330, 8792, 1594, 4725, 4586, 5729};
		// 0 0 2 3 3 3 3 3 4 6 
		int[] temp = new int[numLength];
		for(int tempIndex = numLength-1 ; tempIndex>=0 ; tempIndex--) {
			temp[-- countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
		}
		
		for(int j=0; j<temp.length; j++) {
			input[j] = temp[j];
		}
		
	}
	
	public static int getDigit(int position, int value, int radix) {
		return value/(int)Math.pow(radix, position)%radix;
	}
	
}
