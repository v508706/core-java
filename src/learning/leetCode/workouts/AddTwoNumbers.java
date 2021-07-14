package learning.leetCode.workouts;

public class AddTwoNumbers {

	public static void main(String[] args) {
		//int inputArray1[] = {2,4,3};
        //int inputArray2[] = {5,6,4};
		
		//int inputArray1[] = {0};
       // int inputArray2[] = {0};
         
		int inputArray1[] = {9,9,9,9,9,9,9};
	     int inputArray2[] = {9,9,9,9};
		
		NumbersLinkedList list1  = new NumbersLinkedList();
		for (int i = 0; i < inputArray1.length; i++) {
			list1.addLast(inputArray1[i]);
		}
		printLinkedList(list1.head);

        
        NumbersLinkedList list2  = new NumbersLinkedList();
        for (int j = 0; j < inputArray2.length; j++) {
			list2.addLast(inputArray2[j]);
		}
        printLinkedList(list2.head);
        
        ListNode resultNode = addTwoNumber(list1.head, list2.head);
        printLinkedList(resultNode);
	}
	
	
	public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p= l1, q =l2, currentNode = dummyHead;
		int carry = 0;
		while (p!=null || q!=null) {
			
			int x = (p!=null) ? p.val:0;
			int y = (q!=null) ? q.val:0;
			int sum = x+y+carry;
			carry = sum/10;
			System.out.println(x+"+"+y+" => "+sum%10 + " and carry is :" +carry);
			currentNode.next = new ListNode(sum%10);
			currentNode = currentNode.next;
			if(p!=null) p = p.next;
			if(q!=null) q = q.next;
			
		}
		if(carry > 0) {
			currentNode.next = new ListNode(carry);
		}
		return dummyHead.next;
		
	}
	
	static void  printLinkedList(ListNode node) {
		System.out.println("Printing List... ");
		while(node!=null) {
			System.out.println(node.val+ " ");
			node = node.next;
		}
		System.out.println("List Printed");
	}

} 

class NumbersLinkedList{
	ListNode head;
 
	 
	 
	 void addLast(int val) {
		 
		 if(head == null) {
			 head =new ListNode(val); 
		 }
		 else {
			 ListNode currentNode  = head;
			 while(currentNode.next !=null) {
				 currentNode = currentNode.next;
			 }
			 currentNode.next = new ListNode(val);
		 }
		 
	 }

}

class ListNode{
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int val){
		this.val = val;
	}
	ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
}
