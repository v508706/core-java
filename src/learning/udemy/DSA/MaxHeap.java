package learning.udemy.DSA;

public class MaxHeap {
	
	private int[] heap;
	private int size;
	
	public MaxHeap(int capacity) {
	  heap = new int[capacity];
	}
	
	public boolean isFull() {
		return heap.length==size;
	}
	
	public int getParent(int index) {
		return (index-1)/2;  //parent index= floor ((i-1)/2) There is no need to floor explicitly for java int
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is empty");			
		}
		return heap[0];
	}
	
	//O(n) because of fixAbove
	public void insert(int value) {
		if(isFull()){
			throw new IndexOutOfBoundsException("Heap is full");
		}
		heap[size] = value;
		fixHeapAbove(size);
		size++;
	}
	
	//O(n) for searching , O(logn) to fix the heap => so it will be O(nlogn).
	// if delete is for root there is no need to search n so it will be only O(logn)
	public int delete(int index) {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is empty !");
		}
		int deletedValue = heap[index];
		int parentIndex = getParent(index);
		heap[index] = heap[size-1];
		
		if(index==0 || heap[index]<heap[parentIndex]) {
			fixHeapBelow(index, size-1);
		}else {
			fixHeapAbove(index);
		}
		
		size--;
		return deletedValue;
		
	}
	private void fixHeapAbove(int index) {
		int newValue  = heap[index];
		while(index>0 && newValue > heap[getParent(index)]) {
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}
		heap[index] = newValue;
	}
	
	private void fixHeapBelow(int index, int lastHeapIndex) {
		int childToSwap;
		while(index<=lastHeapIndex) {
			int leftChildIndex = getChild(index, true);
			int rightChildIndex = getChild(index, false);
			
			if(leftChildIndex<=lastHeapIndex) {
				if(rightChildIndex > lastHeapIndex) { // there is no right child so we need to swap left child 
					childToSwap = leftChildIndex;
				}else  {
					childToSwap = heap[leftChildIndex]>heap[rightChildIndex]?leftChildIndex:rightChildIndex;
				}
				
				if(heap[index]<heap[childToSwap]) { // fix only if cur delete element is less than childToSwap
					int tmp = heap[childToSwap];
					heap[childToSwap] = heap[index];
					heap[index] = tmp;
					
					index = childToSwap; // as per trainer it goes below else but i think it is correct to way here
				}else {
					break;
				}
				
			}else {
				break;
			}
		}
	}
	
	public void printHeap() {
		for(int i=0; i<size;i++) {
			System.out.print(heap[i]);
			System.out.print(",");
		}
		System.out.println();
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int getChild(int index, boolean left) {
		return 2*index +(left ?1:2); //left child index  = 2i+1, right child index= 2i+2
	}
	
}
