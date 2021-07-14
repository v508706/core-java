package learning.hacker_rank.interview_prep_kit.arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

	 /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static  int[] rotateLeft(int d,  int[] arr) {
    	
    	/**for(int i=0; i<d;i++) {	 // Rotate for given no of times
    		int firstElement = arr[0];
    		for(int j=0; j<arr.length-1;j++) {
    			arr[j] =arr[j+1];
    		}
    		arr[arr.length-1] =firstElement;
    		
    		
    		/**int firstElement = arr.get(0);
    		for(int j=0; j<arr.size()-1;j++) {
    			arr.set(j, arr.get(j+1));
    		}
    		arr.set(arr.size()-1, firstElement); 
    		
    	}
    	return arr;
    	*/
    	int size = arr.length;
    	int[] rotated = new int[size];
     
    	System.arraycopy(arr, d, rotated, 0, size-d);
    	System.arraycopy(arr, 0, rotated, size-d, d);
    	
    	return rotated;

    	 
    }

 

 
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        //List<Integer> arr = new ArrayList<>();
        
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(arrTemp[i]);
         }

        int[] result =  rotateLeft(d, arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));
        	 
            if (i != result.length - 1) {
              bufferedWriter.write(" ");
            	
            }
        }

       bufferedWriter.newLine();

        bufferedReader.close();
       bufferedWriter.close();
    }	
    
}
