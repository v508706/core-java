package learning.override_understanding;

//Can we override static method in java ?
/**
 * No, we can not override static method in java. Static methods are those which can be called without creating object of class,they are class level methods.

On other hand,If subclass is having same method signature as base class then it is known as method overriding. Its execution decided at run time.
 
 As per the rules of method overriding, method call is resolved at run time by the type of object.So, in our above example d.hello() in second example should call hello() method of DisplayMessage class because reference variable of Display class is referring an object of DisplayMessage but it call Display class hello() itself.This happens because static method is resolved at compile time.

So If derived class’s static method have same signature as base class’s static method, it is called method hiding not method overriding.
 *
 */

/*
 * This is the difference between overrides and hiding,

If both method in parent class and child class are an instance method, it called overrides.
If both method in parent class and child class are static method, it called hiding.
One method cant be static in parent and as an instance in the child. and visa versa.
 */

class Display {
	public static void hello()      
	{
		System.out.println("Hello...Good morning");
	}
}
class  DisplayMessage extends Display
{

	public static void hello()    
	{
		System.out.println("Hello...everyone");
	}
}
public class MethodHidingOverriding
{
	public static void main(String args[])
	{
		Display d=new Display();   
		d.hello();

		d=new DisplayMessage();    
	 
		d.hello();        

		DisplayMessage ds=new DisplayMessage();    
		ds.hello();
	}

}
