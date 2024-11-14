public class palindromeLL {
    public static class Node {
          int data;
          Node next;
          public Node(int data){
            this.data=data;
            this.next=null;
          }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
       Node new_node=new Node(data);
        if(head == null){
           head=tail=new_node;
           return;
        }
        new_node.next=head;
        head=new_node;
    }
    public Node findNode(Node head){
        //slow-fast approach
        Node slow=head;
        Node fast =head;
        while(fast !=null && fast.next !=null){
            slow=slow.next;        //+1
            fast=fast.next.next;   // +2
        } 
        return slow;
    }
public boolean check_palindrome(){
    // step 1 : find midNode
    Node midNode=findNode(head);

    // step 2: reverse 2nd half
    Node prev=null;
    Node curr=midNode;
    Node next;
    while(curr !=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    
    //step 3: checking 1st half==rev of 2nd half
     Node leftNode=head;
     Node rightNode=prev;
     while(rightNode!=null){
        if(leftNode.data!=rightNode.data){
            return false;
        }
        leftNode=leftNode.next;
        rightNode=rightNode.next;
     }
     return true;
}

    // print linkedlist

     public void print(){
        Node tmep = head ;
        while(tmep!=null){
            System.out.print(tmep.data+"-->");
            tmep=tmep.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        palindromeLL ll =new palindromeLL();
        ll.addFirst(1);ll.addFirst(2);ll.addFirst(3);ll.addFirst(4); ll.addFirst(5);
        ll.print();
       System.out.println( ll.check_palindrome());
    }
}
