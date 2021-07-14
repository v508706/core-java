package learning.important_problems;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleMaxDifference {

	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter No Of Days : ");
		int length = input.nextInt();
		int[] priceArray = new int[length];
		
		System.out.println("Enter prices for each day : ");
		for(int i=0; i<length; i++) {
			priceArray[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(priceArray));
		
		
		int max_diff = -1;
		
		for(int j=0; j<priceArray.length; j++) {			
			int previousDayindex = j;
			while(previousDayindex>0) {
				int prevDayDiff = (priceArray[j]-priceArray[--previousDayindex]);
			//	System.out.println(priceArray[j] +"-"+ (priceArray[previousDayindex]) +"="+ prevDayDiff);
				if(prevDayDiff>max_diff) {
					max_diff = prevDayDiff;
				}
			}
		}
		
		System.out.println("Maximum Postive Spread is : "+max_diff);
		
		
	}
}
