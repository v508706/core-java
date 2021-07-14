package learning.udemy.DSA;

public class TreeIndex {

	/**
	 * 
	 * Tree
	 * 		Hierarchical data structure 
	 * 		node :every item in the tree
	 * 		root : node at top of tree
	 * 		parent 
	 * 		children
	 * 		leaf : has no children
	 * 		Edge : arrow between nodes
	 * 		Path : is the path taken from node a to b
	 * 		Depth : no of edges from the node to reach root. generally Level = Depth 
	 * 		Height : no of edges on the longest path form node to leaf (from below). leaf always have height 0. 
	 * 				Height of root node is height of tree
	 * 		one root node 
	 * 		every non-root node has only one parent
	 * 		Real time example :
	 * 			file system : each drive is a root like C: 
	 * 			Java class and extending : root is object 
	 * 		A singleton tree is a tree with only one root node
	 * 		Every tree contains subtree
	 * 		ancestor are the nodes in the path to reach the node
	 * 
	 * Binary Tree:
	 * 		Every Node has 0, 1, or 2 children
	 * 		Children Left and right child
	 * 		in practice we use binary search tree
	 * 		Different possibilities :		
		  		It is fine to have incomplete binary tress
		  		Complete Binary tree is complete (except leaf node) has 2 children. and last level left as much as possible.
		  		Full Binary tree is also complete binary tree but all level as 2 children including last  
	 * 		
	 * Binary Search Tree:
	 * 		Can perform insertion, deletion and retrievals in O(logn) time
	 * 		left child is smaller value than its parent
	 *  	right child is greater value than its parent
	 *  	Duplicates :
	 *  		we should choose whether to keep in left or right
	 *  		we can have counter 
	 *  	We can get Min value by following the left edges and reach root O(h)
	 *  	We can get Max value by following the right edges and reach root O(h)
	 *  	if we sort and insert in BST then it will be became linked list and we end up in O(n)
	 *  	There is self balancing trees like AVL and Red Black Trees to avoid above situation
	 *  
	 *  Binary Search Tree Traversal :
	 *  	Level - visit nodes on each level
	 *  	Pre-order - visit the root of every subtree first 
	 *  	Post-order - vist te root of every subtree last 
	 *  	In-Order - visit left child, then root , then right child
	 *  
	 *  
	 *  Level : Level 0,1,2... left to right. not used often 
	 *  Pre meaning root first before childs, eNtire left and entire right [ROOT, LEFT, RIGHT]   
	 *  Inorder : completely left, root, completely right . 
	 *  		  The data is sorted and that is why it is called in-order. [LEFT, ROOT, RIGHT] 
	 *  Post : entire left and then entire right and then root : [LEFT,RIGHT,ROOT]
	 *  
	 *  BST Delete
	 *  	Delete node which is a leaf
	 *  	Delete node with one leaf (left/right)
	 *  	Delete node with 2 leaf
	 *  
	 *  
	 *  
	 * 	
	 */
}
