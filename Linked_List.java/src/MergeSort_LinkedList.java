public class MergeSort_LinkedList {
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
   private Node findMindNode(Node head){
    Node slow=head;
    Node fast= head.next;          // as mid node = left half ka last node
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;   /// slow=mid node;
   }
   public Node MergeSort(Node head){
    //  base case
    if(head==null  || head.next==null){
        return head;
    }
        // kaam
     // step1 : find the mid node
     Node midNode=findMindNode(head);

     // step2: left and right part;
     Node right_head=midNode.next;
     midNode.next=null;
    Node newleft= MergeSort(head);    // left part
    Node newRight= MergeSort(right_head);  // right part

     // step3: merge left and right part
     return merge(newleft,newRight);
   }
   private Node  merge(Node left_head,Node right_head){
    Node mergLL=new Node(-1);
    Node temp=  mergLL;
    while(left_head!=null && right_head !=null){
        if(left_head.data<=right_head.data){
            temp.next=left_head;
            left_head=left_head.next;
          temp=temp.next;
        }
        else{
           temp.next=right_head;
            right_head=right_head.next;
             temp=temp.next;
        }
    }
    while(left_head !=null){
        temp.next=left_head;
            left_head=left_head.next;
          temp=temp.next;
    }
    while(right_head !=null){
          temp.next=right_head;
            right_head=right_head.next;
             temp=temp.next;
    }
    return mergLL.next;
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
    MergeSort_LinkedList ll =new MergeSort_LinkedList();
   ll.addFirst(1); ll.addFirst(2); ll.addFirst(3); ll.addFirst(4); ll.addFirst(5);
   ll.print();
  ll.head=ll.MergeSort(ll.head);
   ll.print();
   }
}
