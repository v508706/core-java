package learning.hacker_rank.practice.java;

import java.util.Scanner;

public class StdInStdOut2 {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}

}
