package learning.generics_example;

import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		Container<Number> container = new Container<>();
		container.value=9.9;
		container.show();
		
		container.demo(new ArrayList<Number>());
		
	}

}


class Container<T extends Number>{
	
	T value;
	
	public void show() {
		System.out.println(value.getClass().getName());
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public void demo(ArrayList<? extends T> obj) {
		
	}
	
	
}