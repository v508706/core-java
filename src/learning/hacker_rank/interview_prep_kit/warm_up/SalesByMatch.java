package learning.hacker_rank.interview_prep_kit.warm_up;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SalesByMatch {

	public static void main(String[] args) {
		System.out.println(sockMerchant(7, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
		System.out.println(sockMerchantUsingSet(7, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
	}
	
	 public static int sockMerchant(int n, List<Integer> ar) {
		 
		 	int pairCount = 0;
		 	HashMap<Integer, Integer> map = new HashMap<>();
		 	for(int i=0; i<ar.size();i++) {
		 		if(map.containsKey(ar.get(i))&& map.get(ar.get(i))!=0) {
		 			pairCount++;
		 			map.put(ar.get(i), 0);
		 			
		 		}else {
		 			map.put(ar.get(i), 1);
		 		}
		 	}
		 
		 	return pairCount;

		 	
	}
	 
	 public static int sockMerchantUsingSet(int n, List<Integer> arr) {

		 	HashSet<Integer> unmatched = new HashSet<>();
		 	int pairs = 0;
		 	for(int i = 0; i < arr.size(); i++) {
		 	    if(!unmatched.add(arr.get(i))){
		 	        unmatched.remove(arr.get(i));
		 	        pairs++;
		 	    }
		 	}
		 	return pairs;
	 }
	 

}
