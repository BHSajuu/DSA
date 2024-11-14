public class MinDistBwtTwoNodes {
    public static class  Node {
         int data;
         Node left;
         Node right;
         public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
         }
    }

      public static Node Lca(Node root,int n1,int n2){
        if(root==null || n1==root.data || n2==root.data){
            return root;
        }
        Node leftLca= Lca(root.left, n1, n2);
        Node rightLca= Lca(root.right, n1, n2);
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }
        return root;
      }

      public static int lcaDist(Node root,int n){
        if(root==null){
          return -1;
        }
        if(root.data == n){
          return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist ==-1 && rightDist ==-1)
         return -1;
        else if(rightDist==-1)
         return leftDist+1;
        else
          return rightDist+1;
      }
      public static int minDistance(Node root, int n1,int n2){
          Node lca = Lca(root, n1, n2);
          int d1=lcaDist(lca,n1);
          int d2=lcaDist(lca,n2);
          return d1+d2;
      }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.right = new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);
        System.err.println(minDistance(root, 4,7));
    }
}
