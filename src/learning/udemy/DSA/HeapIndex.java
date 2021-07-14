package learning.udemy.DSA;

public class HeapIndex {
	
	/**
	 * Heaps:
	 * 		A complete binary tree
	 * 		Must satisfy the heap property
	 * 			Max heap : Every Parent is greater than or equal to it children
	 * 			Min heap : Every Parent is lesser than or equal to it children
	 * 		Children are added at each level from left to right 
	 * 		Usually implemented as arrays because We can back complete binary with an array
	 * 		The maximum or minimum value will be always at the root of the tree 
	 * 		Above one is advantage of the heap 
	 * 		Heapify : processs of converting a binay tree into a heap. this often has to be  
	 * 				 	done after an insertion or deletion
	 * 
	 * For the node at array [i]
	 * 	left child  = 2i+1
	 * 	right child = 2i+2
	 * 	parent		= floor ((i-1)/2)
	 * 
	 * Heapify : when new element is inserted then we compare with it parent and then 
	 * 				swap to maintain min / max heap 
	 * 
	 * Heaps - Delete : 
	 * 			Must choose a replacement value
	 * 			will take rightmost value, so the tree remains complete
	 * 			Then we must heapify the heap
	 * 			when replacement value is greater than parent then we fix heap above , otherwise fix heap below
	 * 			Fix heap above - same as insert .. swap replacement value with parent
	 * 			Fix heap below - swap the replacement value with larger of its two children
	 			Repeat
	 			
	 * 
	 * 
	 *  
	 * 
	 */

}
