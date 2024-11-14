import java.util.*;
public class PreOrderCode {
    public static class Node {
           int data;
           Node left;
           Node right;
           Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;
           }
        
    }

    public static class BinaryTrees{
         static int idx=-1;
          public static Node buildTree(int order[]){
            idx++;
            if(order[idx] == -1)
              return null;
            Node newNode= new Node(order[idx]);
            newNode.left=buildTree(order);
            newNode.right=buildTree(order);
            return newNode;
          }
        public static void preOrder(Node root){
            if(root == null)
              return;
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // level order traversal
        public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode= q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else
                       q.add(null);
                }
                else{
                    System.out.print(currNode.data +" ");
                    if(currNode.left !=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int order[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTrees trees = new BinaryTrees();
        Node root = trees.buildTree(order);
        System.out.println(root.data);
         trees.preOrder(root);
        trees.levelOrder(root);
    }
}
