package learning.hacker_rank.interview_prep_kit.warm_up;

import java.util.Arrays;
import java.util.List;

public class JumpingOnClouds {
	
	public static void main(String[] args) {
		System.out.println(jumpingOnClouds(Arrays.asList(0,0,0,0,1,0)));
	}

	 public static int jumpingOnClouds(List<Integer> c) {
		 int jumps =0; 
			 int i =0;
			 while(i<c.size()-1) {
				 if(i+2 < c.size()&& c.get(i+2)==0) {
					 jumps++;
					 i=i+2;
				 }else if(c.get(i+1)==0){
					 jumps++;
					 i++;
				 }else {
					 i++;
				 }
			 } 
		 return jumps;
	}
}
