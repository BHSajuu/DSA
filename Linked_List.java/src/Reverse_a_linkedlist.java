public class Reverse_a_linkedlist {
    public static class Node{
         int data ;
         Node next;
         public Node(int data ){
              this.data=data;
              this.next=null;
         }
    }
    public static Node head;
    public static Node tail;
    public void  Reverse(){
      Node prev=null;
      Node curr=tail=head;
      Node next;
      while(curr!=null){
          next=curr.next;          // step 1
          curr.next=prev;          // step 2
          prev=curr;               // step 3
          curr = next;             // step 4
      }
      head=prev;
    }
     public void addFirst(int data){
        Node new_node = new Node(data);
       // size++;
        if(head==null){
            head=tail=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
       public void print(){
        Node tmep=head;
        while(tmep!=null){
            System.out.print(tmep.data+"-->");
            tmep=tmep.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Reverse_a_linkedlist ll = new Reverse_a_linkedlist();
        ll.addFirst(9); ll.addFirst(3); ll.addFirst(1); ll.addFirst(6); ll.addFirst(8);
        ll.print();
        System.out.println();
        ll.Reverse();
        ll.print();
    }
}
