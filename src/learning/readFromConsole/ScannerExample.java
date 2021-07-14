package learning.readFromConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws IOException {
	 String s = System.console().readLine();
	 System.out.println("Console Read : "+s);
	 
	 char[] p = System.console().readPassword();
	 System.out.println("Console Read Password : "+p);
	 
	 //nextInt and nextLine
	}

}
