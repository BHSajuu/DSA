public class Remove_nthNode_from_End {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
     public void addFirst(int data){
        Node new_node = new Node(data);
         size++;
        if(head==null){
            head=tail=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    public void remove(int Nth){
      Node prev=head;
      for(int i=1;i<size-Nth;i++){
        prev=prev.next;
      }
          prev.next=prev.next.next;
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
        Remove_nthNode_from_End ll = new Remove_nthNode_from_End();
        ll.addFirst(9); ll.addFirst(3); ll.addFirst(1); ll.addFirst(6); ll.addFirst(8);
        ll.print();
        System.out.println();
        ll.remove(3);
        ll.print();
    }
}
