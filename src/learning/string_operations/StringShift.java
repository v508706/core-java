package learning.string_operations;

public class StringShift {
	
	public static void main(String[] args) {
		
		String s = "ABCDEFGHIJ";
		int len = s.length();
		int shift = 4;
		String result = "";
		System.out.println(s);
		//Right Rotate
		result = s.substring(len-shift,shift)+s.substring(0, len-shift);
	 
		System.out.println(result);
	}

}
