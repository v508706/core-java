package learning.hacker_rank.practice.java;

import java.util.Scanner;

public class StdInStdOut {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] ints = new int[3];
		//System.out.println("Enter 3 Integers :: ");
		 for(int i=0; i<3;i++) {
			 int input = scanner.nextInt();
			 ints[i] = input;			 
		 }
		// System.out.println("Output : ");
		 for(int j=0; j<ints.length; j++) {
			 System.out.println(ints[j]);
		 }
		 scanner.close();
		
	}

}

