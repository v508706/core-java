package learning.algorithms.sorting;

public class ASortingAlgorithm {

	/**
	 * Bubble sort  	=> O(n^2) =>  stable => In Place algorithm
	 * Stable and Unstable Sort (Based on preserves the relative ordering of duplicate items)
	 * Selection Sort 	=> O(n^2) => unstable => In Place algorithm
	 * Insertion Sort  	=> O(n^2) =>  stable => In Place algorithm. 
	 * 						if most of the values are already sorted then it will be almost linear
	 * Shell Sort		=> O(n^2) depends on gap (3^k-1) can perform better than insertion => Unstable => In Place algorithm => (Variation of Insertion sort, also bubble sort )
	 * Merge Sort 		=> O(nlogn) - base2. => Stable => Not In Place algorithm =>  Divide and Conquer => Needs temp array so if memory issue then this may not be suitable
	 * Quick Sort 		=> O(nlogn) - base2. mostly.. worst case quad ratic (O(n^2)) => UnStable= > Inplace 	 *
	 * Counting Sort	=> O(n) -  Not an in place alogrithm - Not Stable. If we want stable then we need extra steps (with linked list)
	 * Radix Sort 		=> O(n) can acheive because  makes assumptions,
	 * 							 also it often runs slower than O (nlogn) based on sort algorithm chose => Must be stable sort
	 *
	 *Bucket Sort 		=> O(n)
	 *Array.sort => for primitive dual pivot quick sort, for objects stable merge sort  
	 *https://www.baeldung.com/java-sorting#:~:text=As%20mentioned%20in%20the%20official,algorithm%20for%20Array%20of%20Objects.
	 */
}
