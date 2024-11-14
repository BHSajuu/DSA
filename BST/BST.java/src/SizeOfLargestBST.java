public class SizeOfLargestBST {
     
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
      
     public static class Info {
         boolean isBST;
         int size;
         int min;
         int max;
         Info(boolean isBST,int size,int min,int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
         }
     }
     public static int  maxSize=0;
     public static Info sizeOfLargest(Node root){
        if(root ==null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE); // base case 
        }
        Info leftS = sizeOfLargest(root.left);
        Info rightS = sizeOfLargest(root.right);
        int size = leftS.size+rightS.size+1;
        int min = Math.min(root.data, Math.min(leftS.min, rightS.min));
        int max  =  Math.max(root.data, Math.max(leftS.max, rightS.max));

        if(root.data <= leftS.max  || root.data >= rightS.min)   // this true means root toh BST bana rha hai but dont know about left and right subtrees
            {
          return new Info(false, size, min, max) ;
        }     
        // toh ab humai yeh check krna hai ki kia left and right subtrees bi valid BST hai for that
        if(leftS.isBST && rightS.isBST){
             maxSize=Math.max(maxSize, size);
             return new Info(true, size, min, max);
        }
        return new Info(false,size,min,max);
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
        sizeOfLargest(root);
        // Inorder(maxSize);
        System.out.println("        "+ maxSize);
     }

}
