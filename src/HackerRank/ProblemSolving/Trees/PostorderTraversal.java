package HackerRank.ProblemSolving.Trees;
import java.util.*;
import java.io.*;

 
class PostorderTraversal {

/* you only have to complete the function given below.
Node1 is defined as

class Node1 {
    int data;
    Node1 left;
    Node1 right;
}

*/

    public static void postOrder(Node1 root) {
    if(root==null){
        return;
    }

    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data+" ");
    }

	public static Node1 insert(Node1 root, int data) {
        if(root == null) {
            return new Node1(data);
        } else {
            Node1 cur;
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
        Node1 root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        postOrder(root);
    }
}
