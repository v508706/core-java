package learning.udemy.DSA;

public class DoublyLinkedListExample {

	public static void main(String[] args) {
		
		
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        
        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        
        System.out.println(list.getSize());
        list.printList();
        
        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
	}
}
