package learning.hacker_rank.interview_prep_kit.arrays;

import java.util.Scanner;

public class NewYearChaos {
	
	// current position: {1,2,5,3,7,8,6,4}
	//initial position:   {1,2,3,4,5,6,7,8}
	
	// Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        /**int ans = 0;
        for(int i=q.length-1;i>=0;i--){
            int ch_pos = q[i]-(i+1);
            if(ch_pos>2) {
            	System.out.println("Too chaotic");
            	return;
            }
            else{
                //find starting index
                //range[num-2, arr.length] or 0 to length
                int st = Math.max(0,q[i]-2);
                for(int j=st;j<i;j++){
                    if(q[j]>q[i]) ans++;
                }
            }
        }
        System.out.println(ans);*/
    	 int minBribes = 0;
    	    for (int i = 0; i < q.length; i++) {
    	      if (q[i] - 2 > i + 1) {
    	        System.out.println("Too chaotic");
    	        return;
    	      }
    	      for (int j = i - 1; j >= q[i] - 2 && j >= 0; j--) {
    	        if (q[j] > q[i]) minBribes++;
    	      }
    	    }
    	    System.out.println(minBribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }

}
