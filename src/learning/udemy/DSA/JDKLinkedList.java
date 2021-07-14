package learning.udemy.DSA;

import java.util.Iterator;
import java.util.LinkedList;

public class JDKLinkedList {
	
	public static void main(String[] args) {
		
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        
        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);
        
        Iterator ite = list.iterator();
        while(ite.hasNext()) {
        	System.out.print(ite.next());
        	System.out.print("<=>");
        }
        System.out.println("null");
        
        Employee billEnd = new Employee("Bill", "End", 3245);
        list.add(billEnd);
        ite = list.iterator();
        while(ite.hasNext()) {
        	System.out.print(ite.next());
        	System.out.print("<=>");
        }
        System.out.println("null");
        
        list.removeFirst();
        ite = list.iterator();
        while(ite.hasNext()) {
        	System.out.print(ite.next());
        	System.out.print("<=>");
        }
        System.out.println("null");
        
        list.removeLast();
        ite = list.iterator();
        while(ite.hasNext()) {
        	System.out.print(ite.next());
        	System.out.print("<=>");
        }
        System.out.println("null");
        
	}

}
