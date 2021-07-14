package learning.hackerEarth.codemonk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MonkRotation {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());  

		for (int testIndex = 0; testIndex < T; testIndex++) {
			String[] Nandk = br.readLine().split(" ");
			int numberOfElements = Integer.parseInt(Nandk[0]);
			int numberOfRotations = Integer.parseInt(Nandk[1]);
			String[] arrayElements = br.readLine().split(" ");
			int[] nums = new int[numberOfElements];
			for(int i=0;i<numberOfElements;i++) {
				nums[i]=Integer.parseInt(arrayElements[i]);
			}
			
			rotate(nums, numberOfRotations);
			//System.out.println();
			/**for(int i=0;i<numberOfElements;i++) {
			System.out.print(nums[i]+" ");
			}*/
			String op = Arrays.toString(nums).replace(", "," ");
			System.out.println(op.substring(1,op.length()-1));
		}
	}

	public static void rotate(int[] nums, int k) {
			
			int length = nums.length;
			k%=length;
			reverse(nums, 0, length-1);
			reverse(nums, 0, k-1);
			reverse(nums, k, length-1);
					
		}
		
		private static void reverse(int nums[], int start, int end) {
			while(start<end) {
				int tmp = nums[start];
				nums[start] = nums[end];
				nums[end]= tmp;
				start++;
				end--;
			}
			
		}
	
}
