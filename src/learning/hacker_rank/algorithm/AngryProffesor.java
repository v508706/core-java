package learning.hacker_rank.algorithm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AngryProffesor {

	// Complete the angryProfessor function below.
	static String angryProfessor(int k, int[] a) {
		int arrivalThreshold = 0;
		for (int j = 0; j < a.length; j++) {

			int time = a[j];
			if (time <= 0) {
				//System.out.println(time);
				arrivalThreshold++;
			}

		}
		//System.out.println(arrivalThreshold +" - "+threshold);
		if (arrivalThreshold >= k) {
			return "NO";
		} else {
			return "YES";
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int testCaseCount = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < testCaseCount; i++) {
			String[] noOfStdAndThreshold = scanner.nextLine().split(" ");
			int noOfStd = Integer.parseInt(noOfStdAndThreshold[0]);
			int threshold = Integer.parseInt(noOfStdAndThreshold[1]);

			String[] arrivalTimes = scanner.nextLine().split(" ");

			int arrivalThreshold = 0;
			for (int j = 0; j < arrivalTimes.length; j++) {

				int time = Integer.parseInt(arrivalTimes[j]);
				if (time <= 0) {
					//System.out.println(time);
					arrivalThreshold++;
				}

			}
			//System.out.println(arrivalThreshold +" - "+threshold);
			if (arrivalThreshold >= threshold) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
		
		scanner.close();
	}
}
