package learning.hacker_rank.interview_prep_kit.warm_up;

public class CountingValleys {

	public static void main(String[] args) {
		System.out.println(countingValleys(8, "UDDDUDUUDDUDUU"));
	}
	
	public static int countingValleys(int steps, String path) {
		int valleyCounter = 0;
		int levelCounter = 0;
		for(int i=0;i<path.length();i++) {
			char c = path.charAt(i);
			if(c=='U') {
				levelCounter++;
				if(levelCounter==0)
					valleyCounter++;
			}else {
				levelCounter--;
			}
			
		}
		return valleyCounter;

	}
	
}
