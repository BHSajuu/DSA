public class DiameterOfTree {
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

    public static class Info {
          int dia;
          int ht;
          Info(int dia,int ht){
            this.dia=dia;
            this.ht=ht;
          }
    }

    public static Info Diameter(Node root){
        // base case 
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = Diameter(root.left);
        Info righInfo =  Diameter(root.right);
        int diameter = Math.max(Math.max(leftInfo.dia, righInfo.dia), leftInfo.ht+righInfo.ht+1);
        int height = Math.max(leftInfo.ht, righInfo.ht)+1;
        return new Info(diameter, height);
    }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    System.err.println(Diameter(root).dia);
  }
}
