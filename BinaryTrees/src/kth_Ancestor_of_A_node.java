public class kth_Ancestor_of_A_node {
    public static  class Node {
       int data;
       Node left;
       Node right;
      public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
       }
        
    }
    public static int Dist(Node root,int n,int k){
        if(root==null){
          return -1;
        }
        if(root.data == n){
          return 0;
        }
        int leftDist = Dist(root.left, n,k);
        int rightDist = Dist(root.right, n,k);

        if(leftDist ==-1 && rightDist ==-1)
         return -1;
        else if(rightDist==-1){
            if(leftDist+1  == k){
                System.out.println(root.data);
                return 0;
            }
            else
              return leftDist+1;
        }
        else
        if(rightDist+1  == k){
            System.out.println(root.data);
            return 0;
        }
        else
          return rightDist+1;
      }
public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left= new Node(6);
    root.right.right= new Node(7);
    Dist(root, 5,2);
}
}
