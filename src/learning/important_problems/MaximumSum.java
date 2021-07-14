package learning.important_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumSum {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount = br.read();
		br.readLine();
		for(int testCaseIndex=0; testCaseIndex<testCaseCount; testCaseIndex++) {
			 
			 String[] NAndK= br.readLine().split(",");
			 int arrayLength = Integer.parseInt(NAndK[0]);
			 int noOfSubArrays = Integer.parseInt(NAndK[1]);			 
			 
			 String[] arrayElementStr= br.readLine().split(",");
			 Integer[] arrayElements = new Integer[arrayLength];
			 for(int i=0 ; i<arrayElementStr.length; i++) {
				 arrayElements[i]= Integer.parseInt(arrayElementStr[i]);	 
			 }
			 
			 Integer[] reArrangedBobsArrayElements =  Arrays.copyOfRange(arrayElements,0,arrayElements.length);
			 Arrays.sort(reArrangedBobsArrayElements, Collections.reverseOrder());
			 System.out.println("reArrangedBobsArrayElements:"+ Arrays.asList(reArrangedBobsArrayElements));
			 //next k line contains X and Y denoting subarray from index X to Y 
			 List<Integer[]> aliceSubArrayList = new ArrayList<>();
			 List<Integer[]> bobSubArrayList = new ArrayList<>();
			 
			 for(int j=0; j<noOfSubArrays; j++) {
				 String[] XandY= br.readLine().split(",");
				 int X = Integer.parseInt(XandY[0]);
				 int Y = Integer.parseInt(XandY[1]);	
				 Integer[] aliceSubArray = new Integer[(Y+1)-X];				 
				 aliceSubArray = Arrays.copyOfRange(arrayElements, X, Y+1);
				 System.out.println("aliceSubArray:"+Arrays.asList(aliceSubArray).toString());
				 aliceSubArrayList.add(aliceSubArray);
				 
				 Integer[] bobSubArray = new Integer[(Y+1)-X];
				 bobSubArray = Arrays.copyOfRange(reArrangedBobsArrayElements, X, Y+1);
				 System.out.println("bobSubArray:"+Arrays.asList(bobSubArray).toString());
				 bobSubArrayList.add(bobSubArray);
				 
			 }
			 
			 int aliceSum=0;
			 int bobSum=0;
			 for(int subArrIndex=0; subArrIndex<bobSubArrayList.size() &&  subArrIndex<aliceSubArrayList.size(); subArrIndex++) { // alice , bob lenght must be same
				 Integer[] aliceSubArray = aliceSubArrayList.get(subArrIndex);
				 Integer[] bobSubArray = bobSubArrayList.get(subArrIndex);
				 for(int k=0; k<aliceSubArray.length && k<bobSubArray.length;k++) {  // alice , bob lenght must be same
					 aliceSum+=aliceSubArray[k];
					 bobSum+=bobSubArray[k];
				 }
				 System.out.println("SUM AFTER:"+Arrays.asList(aliceSubArray).toString()+":"+Arrays.asList(bobSubArray)+"=>"+aliceSum+":"+bobSum);
			 }
			 
			 System.out.println("Result:"+Math.abs(bobSum-aliceSum));
			 
		}
		
	}

}
