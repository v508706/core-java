package learning.hacker_rank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MinimumAbsoluteDifferenceInAArray {

	

	 

	    /*
	     * Complete the 'minimumAbsoluteDifference' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER_ARRAY arr as parameter.
	     */

	    public static int minimumAbsoluteDifference(List<Integer> arr) {
	    // Write your code here
	    	
	    	//sorting to find min diff 
	    	Integer[] inputArr = new Integer[arr.size()];
	    	inputArr = arr.toArray(inputArr);
	    	Arrays.sort(inputArr);
	    	
	    	int min_diff = Integer.MAX_VALUE;
	    	for(int i=1; i<inputArr.length; i++) {
	    		min_diff = Math.min((inputArr[i]-inputArr[i-1]),min_diff);
	    	}
	    	
	    	return min_diff;

	    }

	 

	 
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	        System.out.println(arrTemp);
	        List<Integer> arr = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrTemp[i]);
	            arr.add(arrItem);
	        }

	        int result = MinimumAbsoluteDifferenceInAArray.minimumAbsoluteDifference(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	 

}
