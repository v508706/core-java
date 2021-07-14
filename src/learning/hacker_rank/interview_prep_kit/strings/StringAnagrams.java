package learning.hacker_rank.interview_prep_kit.strings;
import java.util.Scanner;
public class StringAnagrams {
    public static int numberNeeded(String first, String second) {
        int[] freqFirst = new int[26];
        int[] freqSecond = new int[26];
        int deletions = 0;
        
        for(int i = 0; i < first.length(); i++) { 
            freqFirst[first.charAt(i)-'a'] = freqFirst[first.charAt(i)-'a'] + 1; //Increment frequency of char at i
        }
        for(int i = 0; i < second.length(); i++)
            freqSecond[second.charAt(i)-'a'] = freqSecond[second.charAt(i)-'a'] + 1; //Increment frequency of char at i
        
        for(int i = 0; i < 26; i++) {
        	System.out.println(freqFirst[i] + " - "+freqSecond[i] + " => "+ (freqFirst[i] - freqSecond[i]));
            deletions += Math.abs(freqFirst[i] - freqSecond[i]); //Track the total deletions needed
        }
        
        return deletions;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}