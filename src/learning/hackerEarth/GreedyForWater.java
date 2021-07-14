package learning.hackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GreedyForWater {

	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());  

		for (int testIndex = 0; testIndex < T; testIndex++) {

			String[] NandX = br.readLine().split(" ");
			int N = Integer.parseInt(NandX[0]);
			int X = Integer.parseInt(NandX[1]);

			String[] capacityOfbottlesInput = br.readLine().replaceAll("\\s+$", "").split(" ");
			 int[] capacitiesOfBottlesInATestCase = new int[N];
			for (int i = 0; i < capacityOfbottlesInput.length; i++) {
				capacitiesOfBottlesInATestCase[i]= Integer.parseInt(capacityOfbottlesInput[i]);
			}
 
			int totalCapacity = 0;
			int numberOfBottles = 0;
			Arrays.sort(capacitiesOfBottlesInATestCase);

			for (int j = 0; j < capacitiesOfBottlesInATestCase.length; j++) {
				totalCapacity += capacitiesOfBottlesInATestCase[j];
				if (totalCapacity <= X) {
					numberOfBottles++;
				} else {
					break;
				}
			} 
			System.out.println(numberOfBottles);

		}

	}
}
