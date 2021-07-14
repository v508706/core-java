package learning.junit;
public class MySimpleMath {
    /**
     * A simple method that takes and input and returns
     * "positive" or "negative" depending on the input number 
     */
    public String checkSign(int number) {
        if(number >= 0 ) {
            return "positive";
        } else {
            return "negative";
        }
    }
  
     /* Returns the division of numerator by the denominator.
     * If the denominator is zero, it throws an Exception
     */
    public double divide(int num, int denom) {
        if(denom == 0) { 
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            return num/(double)denom;
        }
        
    }
    
    
    
    public static void main(String args[]) {
        MySimpleMath sm = new MySimpleMath();
        // Check a positive
        System.out.println("Input 10: " + sm.checkSign(10));
        // Check a negative
        System.out.println("Input -2: " + sm.checkSign(-2));
        // Check a positive
        System.out.println("Input 0: " + sm.checkSign(0));
        
    }
    
}