package learning.leetCode.workouts;

import java.util.Scanner;

public class TwoSum {
	
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
		for (int i = 0; i < arrayElements.length; i++) {
			for (int j = 0; j < arrayElements.length; j++) {
				if(i!=j && !matchFound && arrayElements[i]+arrayElements[j] == targetValue) {
					System.out.println("The matching indexes are "+ i+","+ j);
					matchFound = true;
					break;
				}
			}
		}
		
		if(!matchFound)
		System.out.println("No 2 mathcing index is found to get target value");
	}

}
