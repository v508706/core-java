package learning.leetCode.workouts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumOnePassHashTable {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the array size ");
		int arrayLength = scanner.nextInt();
		
		System.out.println("Enter the array elements : ");
		int[] arrayElements = new int[arrayLength];
		for (int i = 0; i < arrayElements.length; i++) {
			int input = scanner.nextInt();
			arrayElements[i] = input;
		}
		
		System.out.println("Enter the target value : ");
		int targetValue = scanner.nextInt();
		
		boolean matchFound = false;
		 
		Map<Integer, Integer> inputMap = new HashMap<>();
		for (int i = 0; i < arrayElements.length; i++) {
			int compliment = targetValue - arrayElements[i];
			if(inputMap.containsKey(compliment)) {
			 System.out.println("THe indexes are :" +inputMap.get(compliment)+","+i );
			 matchFound = true;
			 break;
			}
			
			inputMap.put(arrayElements[i],i) ;
		}
		
		if(!matchFound)
		System.out.println("No 2 mathcing index is found to get target value");
	}

}
