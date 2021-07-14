package learning.hacker_rank.interview_prep_kit.arrays;

import java.util.List;
import java.util.Scanner;

public class HourGlass_2DArray {
	
	public static void main(String[] args) {
		
		int dimension = 6;
		
		int[][] arr = new int[dimension][dimension];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<dimension;i++) {
			String[] input = scan.nextLine().split(" ");
			System.out.println(input + " "+input.length);
			for(int j=0; j<input.length;j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}			
		}
		
		int maxVal = Integer.MIN_VALUE;
		for(int i=0; i<dimension-2;i++) {
			for(int j=0; j<dimension-2;j++) {
				int hgSum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
							arr[i+1][j+1]+
							arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				maxVal =Math.max(maxVal, hgSum);
			}
		}
		
		/**List<List<Integer>> arr1;
		int dimension = arr1.size();
		int maxVal1 = Integer.MIN_VALUE;
		for(int i=0; i<dimension-2;i++) {
			for(int j=0; j<dimension-2;j++) {
				int hgSum = arr1.get(i).get(j)+arr1.get(i).get(j+1)+arr1.get(i).get(j+2)+arr1.get(i+1).get(j+1)+arr1.get(i+2).get(j)+arr1.get(i+2).get(j+1)+arr1.get(i+2).get(j+2);
				maxVal1 =Math.max(maxVal, hgSum);
			}
		}*/
		
		
		
		System.out.println(maxVal);
		
		
		
		
		for(int i=0; i<dimension;i++) {
			for(int j=0; j<dimension;j++) {
			
				//first row  startIndex startIndex+1 startIndex+2 
				//mid row 		0 startIndex+1 0
				// Thirde row startIndex startIndex+1 startIndex+2
				
				
				
			
			}			
		}
		
		
		
		for(int i=0; i<dimension;i++) {
			for(int j=0; j<dimension;j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}			
			System.out.println();
		}
		
		
	}

}
