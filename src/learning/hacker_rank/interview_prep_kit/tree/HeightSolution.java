package learning.hacker_rank.interview_prep_kit.tree;

import java.util.Scanner;

public class HeightSolution {

	/*
	 * class Node int data; Node left; Node right;
	 */
	public static int height(Node temp) {

	    //Check whether tree is empty  
        if(temp == null) {  
             System.out.println("Tree is empty");  
            return 0;  
        }  
        else {  
            int leftHeight = 0, rightHeight = 0;  
            
            if(temp.left == null && temp.right == null) {
            	return 0;
            }
            //Calculate the height of left subtree  
            if(temp.left != null)  
                leftHeight = height(temp.left);  
  
            //Calculate the height of right subtree  
            if(temp.right != null)  
                rightHeight = height(temp.right);  
  
            //Compare height of left subtree and right subtree  
            //and store maximum of two in variable max  
            int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;  
  
            //Calculate the total height of tree by adding height of root  
            return (max + 1);  
        }  
		
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
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
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		int height = height(root);
		System.out.println(height);
	}
}

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}