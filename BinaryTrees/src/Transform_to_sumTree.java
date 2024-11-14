
public class Transform_to_sumTree {

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
  public static int transform(Node root){
     //  base case 
     if(root == null){
        return 0;
     }
     //kaam
     int leftS=transform(root.left);
     int rightS = transform(root.right);
     int tmp=root.data;
     root.data=leftS+rightS;
     return tmp+leftS+rightS;
  }
 
  public static void preOrder(Node root){
    if(root == null)
      return;
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
}
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left= new Node(6);
    root.right.right= new Node(7);
   preOrder(root);
   transform(root);
   System.out.println();
   preOrder(root);
}
}
