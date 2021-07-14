package learning.udemy.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		int[] intArray = new int[7];
		intArray[0] = 20;
		intArray[1] = -1;
		intArray[2] = 100;
		intArray[3] = -300;
		intArray[4] = 200;
		intArray[5] = 7;
		intArray[6] = 300;
		
		//Arrays.sort(intArray);
		Arrays.parallelSort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		 

	}

}
