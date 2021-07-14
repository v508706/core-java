package learning.Java8Features;

public class DefaulStaticMethodInInterface {
	
	public static void main(String[] args) {
	
		TestClass tc = new TestClass();
		
		tc.commonMethod();
		tc.defaultMethod1();
		tc.defaultMethod2();
		tc.method1();
		tc.method2();
		 
	}
	 

}


interface Interface1 {
	void method1();
	void commonMethod();
	default void defaultMethod1() {
		System.out.println("defaultMethod from Interface 1");
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod from Interface 1");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod from Interface 1");
	}
}

@FunctionalInterface
interface Interface2{
	void method2();

	default void defaultMethod2() {
		System.out.println("defaultMethod from Interface 2");
	}
	
	
	
	static void staticMethod() {
		System.out.println("staticMethod from Interface 2");
	}
}


class TestClass implements Interface1, Interface2{

	@Override
	public void method2() {
		System.out.println("METHOD2 Implementation...");
		
	}

	@Override
	public void method1() {
		System.out.println("METHOD1 Implementation...");
		
	}

	@Override
	public void commonMethod() {
		System.out.println("commonMethod Implementation...");
		
	}
	
	@Override /** NOTE : This is mandatory to avoid DIAMOND PROBLEM, Without below function it will not be compiled*/
	public void defaultMethod2() {
		System.out.println("defaultMethod2 from Interface 2 in TestClas Implementation");
		Interface1.staticMethod();
	}
	 
	 
	
}