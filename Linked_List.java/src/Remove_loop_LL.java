public class Remove_loop_LL {
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
    public static boolean findloop(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next !=null){
            slow= slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        
        return false;
    } 
    public static void remove_loop(){
        // detect the loop
        Node slow=head;
        Node fast=head;
        boolean iscylce=false;
        while(fast!=null && fast.next !=null){
            slow= slow.next;
            fast=fast.next.next;
            if(slow == fast){
                iscylce=true;
                break;
            }
        }
       if(iscylce==false)
          return;

          // find meeting point 
          slow=head;
          Node prev=null;
          while(slow != fast ){
            prev=fast;
            slow=slow.next;  // +1
            fast=fast.next;   // +1 (imp)
          }
        
          // remove cycle 
           prev.next=null;   // prev=last node 
    }
    public static void main(String[] args) {
        head=new Node(1);
        head.next=new Node(2);
        Node temp= head.next;
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=temp;
        System.out.println(findloop());
        remove_loop();
      System.out.println(findloop());    }

}
