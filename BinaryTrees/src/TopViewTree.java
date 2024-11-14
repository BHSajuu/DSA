import java.util.*;

public class TopViewTree {
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
          Node node;
          int hd;
          Info(Node node,int hd){
            this.node= node;
            this.hd=hd;
          } 
      } 


      public static void topView(Node root){
        HashMap<Integer,Node> map = new HashMap<>();
        Queue<Info> q = new LinkedList<>();//for level order traversal  and q ki hum node ka sath HD vi check keraga so queue ka type info
        q.add(new Info(root,0));
        q.add(null);
        int min=0,max=0;
        while(!q.isEmpty()){
            Info currElement = q.remove();
            if(currElement == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(currElement.hd)){      /// 1st time my hd is occurig
                     map.put(currElement.hd, currElement.node);
                }
                if(currElement.node.left !=null){
                    q.add(new Info(currElement.node.left, currElement.hd-1));
                    min=Math.min(min, currElement.hd-1);
                }
                if(currElement.node.right !=null){
                    q.add(new Info(currElement.node.right, currElement.hd+1));
                    max=Math.max(max, currElement.hd+1);
                }
            }

        }
        
        for(int i=min ; i<=max ;i++){
            System.out.print(map.get(i).data +" ");
        }
    }
      public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left= new Node(6);
        root.right.right = new Node(7);
        topView(root);
      }
}
