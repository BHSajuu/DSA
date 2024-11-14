

public class Assign_01 {
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
    // public void addFirst(int data){
    //     Node new_node=new Node(data);
    //     if(head==null){
    //         head=tail=new_node;
    //         return;
    //     }
    //     new_node.next=head;
    //     head=new_node;
    // }
    

    //find the point of interaction
    public static int  find_interaction(Node H1, Node H2){
        Node slow=H2;
        Node fast=H1;
        while(fast!=null){
           slow=slow.next;
           fast=fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
      Node head_1=new Node(1);
       head_1.next=new Node(2);
       head_1.next.next=new Node(3);
       head_1.next.next.next= new Node(6);
       head_1.next.next.next= new Node(7);
       Node head_2=new Node(4);
       head_2.next=new Node(5);
       head_2.next.next=new Node(6);
       head_2.next.next.next= new Node(7);
       System.out.println("interaction node is =" + find_interaction(head_1,head_2));
    }

    // by  maam

    //  public static class Node {
    // int data;Node next;
    // public Node(int d){
    //     data = d;next = null;}
    // }
    // public Node getIntersectionNode(Node head1, Node head2){
    //     while (head2 != null) {
    //         Node temp = head1;
    //         while (temp != null) {
    //             if (temp == head2) {
    //                 return head2;
    //             }
    //             temp = temp.next;
    //         }
    //         head2 = head2.next;
    //     }
    //     return null;
    // }
    // public static void main(String[] args){
    //     App list = new App();
    //     Node head1, head2;
    //     head1 = new Node(10);
    //     head2 = new Node(3);
    //     Node newNode = new Node(6);
    //     head2.next = newNode;
    //     newNode = new Node(9);
    //     head2.next.next = newNode;
    //     newNode = new Node(15);
    //     head1.next = newNode;
    //     head2.next.next.next = newNode;
    //     newNode = new Node(30);
    //     head1.next.next = newNode;
    //     head1.next.next.next = null;
    //     Node intersectionPoint= list.getIntersectionNode(head1, head2);
    //     if (intersectionPoint == null) {
    //         System.out.print(" No Intersection Point \n");
    //     }
    //     else {
    //         System.out.print("Intersection Point: "+ intersectionPoint.data);
    //     }
    // }
}





//by maam

