package learning.Java8Features;

public class LambdaFunctionalInterfaceTest {
	public static void main(String[] args) {
		
		// Without Lambda expression
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
			  System.out.println("Thread is executed..");
				
			}
		};
		r.run();
		
		
		/**
		 * Since functional interfaces have only one method, lambda expressions can easily provide the method implementation.
		 *  We just need to provide method arguments and business logic.
		 *   For example, we can write above implementation using lambda expression as:
		 */
		//With Lambda expression
		
		//1.More than single line statement
		//Runnable r1 = ()->{
		//	System.out.println("Thread is executed in Lambda code..");
		//	};
		
		//2. if it is single statement in function
		Runnable r1 = ()->System.out.println("Thread is executed in Lambda code..");
		r1.run();
		
	}
	
	


}
