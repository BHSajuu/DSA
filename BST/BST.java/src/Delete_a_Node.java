import java.util.*;
public class Delete_a_Node {
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
     public static Node delete(Node root,int val){
         if(root.data > val){
            root.left = delete(root.left, val);
         }
         else if(root.data < val){
            root.right = delete(root.right, val);
         }
         else{
            // case1 leaf node 
            if(root.left==null && root.right==null){
                return null;
            }

            // case2 one child node 
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case3 Two child Node 
            Node InorderSuccessor = findInorderSuccessor(root.right);
            root.data = InorderSuccessor.data;
            root.right = delete(root.right, InorderSuccessor.data);
            
         }
         return root;
     }
     public static Node findInorderSuccessor(Node root){
        while(root.left !=null){
            root=root.left;
        }
        return root;
     }
     public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
     }
     public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
           root= build(root, values[i]);
        }
       inorder(root);
       System.out.println();
       int val;
       System.out.print("Enter the Node you want to Delete = ");
       Scanner s = new Scanner(System.in);
       val = s.nextInt();
      root= delete(root, val);
       inorder(root);
    }
}
