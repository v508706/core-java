package learning.readFromConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferredReaderExample {

	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 5; i++) {
			System.out.println("\nWaiting for Input System.in :");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Input Value : "+br.readLine());
		
		}
		 
	}

}
