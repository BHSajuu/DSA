public class search_recursive {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public  static Node tail;
        public void addfisrt(int data){
       Node new_node=new Node(data);
        if(head == null){
          head=tail=new_node;
        }
        new_node.next=head;
        head=new_node;
    }
    public int  re_search(int key){
        return helper(head,key);
    }
    public int  helper(Node head,int key){
        // base case 
        if(head ==null)
          return -1;
        if(head.data==key)
           return 0;   // q ki always o ind pa hota ha ,each level of recusion ki hisab se 
        int idx=helper(head.next, key);
        if(idx==-1)
          return -1;
        return idx+1;  
    }
    public static void main(String[] args) {
        search_recursive ll = new search_recursive();
         ll.addfisrt(9); ll.addfisrt(3); ll.addfisrt(1); ll.addfisrt(6); ll.addfisrt(9);
         System.out.println(ll.re_search(6));
    }
}
