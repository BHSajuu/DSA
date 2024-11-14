import java.util.ArrayList;

public class Root_to_leaf_path {
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
    public static void rootPath(Node root,ArrayList<Integer>list){
        if(root == null)
         return;
        list.add(root.data);
        if(root.left == null && root.right==null){
            System.out.println(list);
        }
        rootPath(root.left, list);
        rootPath(root.right, list);
        list.remove(list.size()-1);
        return;
    }
    // public static void printArrayList(ArrayList<Integer>list){
    //     
    // }
     public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
           root= build(root, values[i]);
        }
        ArrayList<Integer>list = new ArrayList<>();
        rootPath(root,list);
        
    }
}