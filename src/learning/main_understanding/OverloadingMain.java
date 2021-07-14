package learning.main_understanding;


public class OverloadingMain {
 
    public static void main(String[] args) {
        System.out.println("Inside main(String[] args)");
    }
    public static void main(Integer arg1) {
        System.out.println("Inside main(Integer arg1)");
    }
 
    public static void main(Integer[] arr) {
        System.out.println("Inside main(Integer array)");
    }
 
}

/**
Can we overload main method in java
Yes, we can overload main method in java but when you run your program, 
JVM will search for public static void main(String[] args) and execute that method.

*/