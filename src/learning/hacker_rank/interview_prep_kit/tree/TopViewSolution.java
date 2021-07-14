package learning.hacker_rank.interview_prep_kit.tree;

import java.util.*;
import java.io.*;



public class TopViewSolution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
      if(root==null) {
    	  return ;
      }
      
      if(root.left!=null) {
    	  printLeft(root.left);
      }
      System.out.print(root.data+" ");
      if(root.right!=null) {
    	  printRight(root.right);
      }
      
    }
	
	private static void printLeft(Node root) {
		 if(root!=null) {			
			 printLeft(root.left);
			 System.out.print(root.data+" ");
	      }
	      
	}
	
	private static void printRight(Node root) {
		 if(root!=null) {
			 System.out.print(root.data+" ");
			 printRight(root.right);
			
	      }
	     
	}

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        //topView(root);
        topViewUsingDeque(root);
    }	
    
    static void topViewUsingDeque(Node root) {
        if (root == null)
            return;

        Deque<Node> deque = new LinkedList<>();
        Node node = root.left;

        while (node != null) {
            deque.addFirst(node);
            node = node.left;
        }

        deque.addLast(root);
        node = root.right;

        while (node != null) {
            deque.addLast(node);
            node = node.right;
        }

        while (!deque.isEmpty()) {
            System.out.printf("%d ", deque.removeFirst().data);
        }
    }
}

 