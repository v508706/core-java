package learning.data_structures;

public class StackExample {
	
	int arr[] ;	 
	int top;
	int size;
	
	public StackExample(int size) {
		this.size = size;
		this.top=-1;
		this.arr = new int[size];
		 
	}
	
	public void push(int element) {
		if(!isFull()) {
			top++;
			arr[top] = element;
			//System.out.println("Pushed Element :"+element);
		}else {
			System.out.println("Stack is full !");
		}
	}


	public int pop() {
		if(!isEmpty()) {
			int topElement = top;
			top--;
			//System.out.println("Popped Element :"+arr[topElement]);
			return arr[topElement];
		}else {
			System.out.println("Stack is Empty !");
			return -1;
		}
	}
	
	public int peak() {
		if(!isEmpty()) {
			int topElement = top;			 
			//System.out.println("Popped Element :"+arr[topElement]);
			return arr[topElement];
		}else {
			System.out.println("Stack is Empty !");
			return -1;
		}
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	
	public boolean isFull() {
		return (size-1)==top;
	}
	
	
	public static void main(String[] args) {
		
		StackExample stack = new StackExample(10);
		stack.push(3);
		stack.push(7);
		stack.push(9);
		stack.push(11);
		stack.push(2);
		stack.push(5);
		System.out.println(stack.peak());
		System.out.println(stack.peak());
		System.out.println("---POP---");
		while(stack.top!=-1) {
			System.out.println(stack.pop());
		}
		System.out.println("---PUSH---");
		System.out.println(stack.peak());
		
		
		
		
	}
	
}


