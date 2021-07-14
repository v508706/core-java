package learning.algorithms.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		System.out.println(linerSearch(intArray, 35));
		System.out.println(linerSearch(intArray, 352));
		System.out.println(linerSearch(intArray, -22));

	}
	
	private static int linerSearch(int[] input, int value) {
		for (int i = 0; i < input.length; i++) {
			if(input[i]==value) {
				return i;
			}
		}

		return -1;
	}

}
