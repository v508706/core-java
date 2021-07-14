package learning.udemy.DSA;

import java.util.Comparator;
import java.util.PriorityQueue;

public class JDKPriorityQueueTest {

	public static void main(String[] args) {

		// If we need to use other than integer , i.e reference type then we need to
		// give comparable object to compare for PQ

		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		pqueue.add(25);
		pqueue.add(-22);
		pqueue.add(1343);
		pqueue.add(54);
		pqueue.add(0);
		pqueue.add(-3492);
		pqueue.add(429);

		Object[] ints = pqueue.toArray();
		for (Object num : ints) {
			System.out.print(num);
			System.out.print(",");
		}
		System.out.println();
		System.out.println(pqueue.peek());
		System.out.println(pqueue.remove());
		System.out.println(pqueue.peek());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.peek());
		System.out.println(pqueue.remove(54));
		System.out.println(pqueue.peek());
		System.out.println(pqueue.add(-2));
		System.out.println(pqueue.peek());

		PriorityQueue<Student> pq = new PriorityQueue<Student>(5, new StudentComparator());
		Student student1 = new Student("Bruce", 3.2);
		pq.add(student1);
        Student student2 = new Student("Batman", 3.6);
                pq.add(student2);         
        Student student3 = new Student("Matthew", 4.0);
                pq.add(student3);
                
                System.out.println("Students served in their priority order");

				while (!pq.isEmpty()) {
					System.out.println(pq.poll().getName());
				}
	}

}

class StudentComparator implements Comparator<Student> {

	// Overriding compare()method of Comparator
	// for descending order of cgpa
	public int compare(Student s1, Student s2) {
		if (s1.cgpa < s2.cgpa)
			return 1;
		else if (s1.cgpa > s2.cgpa)
			return -1;
		return 0;
	}
}

class Student {
	public String name;
	public double cgpa;

// A parameterized student constructor
	public Student(String name, double cgpa) {

		this.name = name;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}
}