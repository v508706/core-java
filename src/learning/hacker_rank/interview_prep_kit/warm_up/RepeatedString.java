package learning.hacker_rank.interview_prep_kit.warm_up;

public class RepeatedString {
	
	public static void main(String[] args) {
		System.out.println(repeatedString("abcac", 10));
	}
	
	 public static long repeatedString(String s, long n) {
		//long repeatCount = 0;
		long  repeatCountWithInInput = 0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='a') {
				repeatCountWithInInput++;
			}
		}
		long noOfRepeations = n/s.length();
		long reminder = n%s.length();
		long noOfTimeOverallRepeation =noOfRepeations*repeatCountWithInInput; 
		for(int j=0; j<reminder;j++) {
			if(s.charAt(j)=='a') {
				noOfTimeOverallRepeation++;
			}
		}
		
		return noOfTimeOverallRepeation;

	 }
	 

}
