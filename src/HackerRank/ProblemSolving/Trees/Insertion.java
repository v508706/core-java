package HackerRank.ProblemSolving.Trees;
import java.util.Scanner;



class Insertion {

  	public static void preOrder( Node1 root ) {

    	if( root == null)
        	return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

 /* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;

    */

	public static Node1 insert(Node1 root,int data) {
     if(root==null){
         root=new Node1(data);
         return root;
     }
    	if(data<root.data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
    return root;
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
      	preOrder(root);
    }
	
	
}
