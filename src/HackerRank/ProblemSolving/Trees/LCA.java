package HackerRank.ProblemSolving.Trees;
import java.util.Scanner;



class LCA {

	/*
    class Node
    	int data;
    	Node left;
    	Node right;
	*/
	public static Node1 lca(Node1 root, int v1, int v2) {
      	if(root.data<v1 && root.data<v2){
              return lca(root.right,v1,v2);
          }
          if(root.data>v1 && root.data>v2){
              return lca(root.left,v1,v2);
          }
    return root;
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
      	int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node1 ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }
    
    
 
}
