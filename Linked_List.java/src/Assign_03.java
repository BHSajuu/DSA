public class Assign_03 {
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
    public void fuction(int x,int y){
        Node prev_1 = null;
        Node  curr_1 = head;
        while(curr_1.data !=x){
            prev_1=curr_1;
            curr_1=curr_1.next;
        }
         Node prev_2 = null;
        Node  curr_2 = head;
        while(curr_2.data !=y){
            prev_2=curr_2;
            curr_2=curr_2.next;
        }
        Node tmp=curr_1.next;
        curr_1.next=curr_2.next;
        prev_2.next=curr_1;
        curr_2.next=tmp;
        prev_1.next=curr_2;
    }
    public void print(){
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data +"-->");
            tmp=tmp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Assign_03 ll= new Assign_03();
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=new Node(7);
        head.next.next.next.next.next.next.next=new Node(8);
        ll.print();
        ll.fuction(3, 6);
        ll.print();
    }
}
