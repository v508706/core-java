package learning.algorithms.sorting;

import java.util.Arrays;

public class BubbleSortArrayTry {

	
	public static void main(String[] args) {
		
		int[] intArray = new int[7];
		intArray[0] = 20;
		intArray[1] = -1;
		intArray[2] = 25;
		intArray[3] = -3;
		intArray[4] = 56;
		intArray[5] = 7;
		intArray[6] = 14;
		
		
		//for (int i = intArray.length; i > 0; i--) {
		for (int i = 1; i <intArray.length; i++) {
			for(int j=0; j<intArray.length-i;j++) {
				int source = intArray[j];
				int target =  intArray[j+1];
				System.out.println(source + "->"+target );
				if(intArray[j]>intArray[j+1]) {
					 intArray[j]=target ;
					 intArray[j+1] = source;
					System.out.println(intArray[j+1] + "-->"+intArray[j] );
				} 
			}
			
		}
		
		System.out.println(Arrays.toString(intArray));
		
		
		
	}
}
