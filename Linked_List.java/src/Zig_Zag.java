public class Zig_Zag {
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

    public  void ToDoZigZag(){
        // step 1 : to find mind node
        Node misNode=FindMidNode(head);

        // 2nd half reverse
        Node prev=null;
        Node currNode=misNode.next;
        misNode.next=null;
        Node nexNode;
        while(currNode!=null){
           nexNode= currNode.next;
           currNode.next=prev;
           prev=currNode;
           currNode=nexNode;
        }
      // Alternate merging
      Node LH_node=head;
      Node RH_node=prev;
      Node next_L,next_R;
      while(LH_node!=null && RH_node!=null){
        next_L=LH_node.next;
        LH_node.next=RH_node;
        next_R=RH_node.next;
        RH_node.next=next_L;

       LH_node =next_L;
       RH_node =next_R;
      }         
    }
    public  Node FindMidNode(Node head){
       Node slow=head;
       Node fast=head.next;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       return slow;
    }
 public void addFirst(int data){
        Node new_node = new Node(data);
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
        Zig_Zag ll= new Zig_Zag();
        ll.addFirst(1); ll.addFirst(2); ll.addFirst(3); ll.addFirst(4); ll.addFirst(5);
        ll.print();
       ll.ToDoZigZag();
       ll.print();
    }
}
