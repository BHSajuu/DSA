import javax.print.DocFlavor.INPUT_STREAM;

public class mirror_BST {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
         this.data=data;
         this.left=null;
         this.right=null;
        } 
     }
     public static Node build(Node root,int val){ 
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val<root.data){
            root.left=build(root.left, val);
        }
        else{
            root.right=build(root.right, val);
        }
        return root;
     }
    
     public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node leftS=mirror(root.left);
        Node rightS=mirror(root.right);
        root.left=rightS;
        root.right = leftS;
        return root;
     }
     public static void Inorder(Node root){
        if(root == null)
         return;
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
     }
      public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
           root= build(root, values[i]);
        }
      Inorder(root);
      mirror(root);
      System.out.println();
      Inorder(root);
     }

}
