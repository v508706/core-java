package learning.data_structures;

public class LinkedListExample<T> {

	 
	private Node<T> head;
	
	private boolean isEmpty() {
		return (null==head);

	}
	
	private void insertFirst(T data) {						 
		Node<T> firstNode = new Node<>();
		firstNode.data = data;
		firstNode.next = head;
		head = firstNode;

	}
	
	private Node deleteFirst() {
		 Node<T> nextNode = head.next;
		 head = nextNode;
		 return head;
	}
	
	
	private void deleteAfter(Node<T> afterNode) {
		 	 Node<T> current = head;
		while(current.next!=null && current.data != afterNode.data  ) { // select the postion node
			current = current.next;
		}
		if(current.next!=null) // if it is not last element
			current.next = current.next.next;
	}
	
	private void insertLast(T data) {
		Node<T> current  = head;
		Node<T> lastNode = new Node<>();
		lastNode.data = data;
		lastNode.next = null;
		while( current.next!=null) {
			current  = current.next;			 
		}
		current.next = lastNode;
	}
	
	private void printLinkedList() {
		System.out.println("Printing Linked List (head --> last)");
		Node currentNode = head;
		while (currentNode!=null) {
			currentNode.displayNodeData();
			currentNode = currentNode.next;
			
		}
		
	}
	
	public static void main(String args[]) {
		LinkedListExample<Integer> myLinkedlist = new LinkedListExample<>();
	   	myLinkedlist.insertFirst(50);
	     myLinkedlist.insertFirst(60);
        myLinkedlist.insertFirst(70);
        myLinkedlist.insertFirst(10);
        myLinkedlist.insertLast(20);
         myLinkedlist.printLinkedList();
         
         System.out.println("=========================");
         System.out.println("Delete node after Node 60");
         Node node=new Node();
         node.data=60;
         myLinkedlist.deleteAfter(node);
         // After deleting node after 1,Linked list will be
         // 10 -> 70 -> 60 -> 20
  
         System.out.println("=========================");
         myLinkedlist.printLinkedList();
         
}
	
}



class Node<T> {
	
	public T data;
	public Node<T> next;
	
	public void displayNodeData() {
		System.out.println("{"+data+"}");

	}
	
}