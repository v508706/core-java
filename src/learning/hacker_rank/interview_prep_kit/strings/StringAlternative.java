package learning.hacker_rank.interview_prep_kit.strings;

public class StringAlternative {
	public static void main(String[] args) {
		
		
		
		String x = "AAAA";
		String y = "BAABAA";
		
		int delCounter = 0; 
		char curChar = x.charAt(0);
		/**for(int i=1; i<x.length(); i++) {
			if(curChar == 'A' && x.charAt(i) =='A') {
				delCounter++;
			}else if(curChar == 'B' && x.charAt(i) =='B') {
				delCounter++;
			}
			curChar = x.charAt(i);
		}*/
		
		for(int i=1; i<x.length(); i++) {
			if(curChar == x.charAt(i)) {
				delCounter++;
			} 
			curChar = x.charAt(i);
		}
		
		System.out.println(delCounter);
		
		
		
		
	}

}
