public class new_pro {
    public static class Node{
        int data ;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    
    // add first

    public void add_f(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=tail=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    
    public void add_mid(int data,int idx){
        Node new_node=new Node(data);
        if(head==null){
           head=tail=new_node;
           return;
        }
        int i=0;
        Node tmp=head;
        while(i<idx-1){
            tmp=tmp.next;
            i++;
        }
        //i=idx-1  i.c index of  previous node where new node is going to added
        new_node.next=tmp.next;
        tmp.next=new_node;
    }
    // revse 
    public void revse(){
        Node prev=null;
        Node curr=tail=head;
        Node Next;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        head=prev;
    }
    // remove from end 
     public void remove_end(int idx){
        int i=0;
        Node tmp=head;
        while(i<idx){
            tmp=tmp.next;
            i++;
        }
        tmp.next=tmp.next.next;
     }
    public void print(){
        Node tmp=head;
        while(tmp!=null){
        System.out.print("-->" + tmp.data );
        tmp=tmp.next;
        }
    }
    public static void main(String[] args) {
        new_pro ll= new new_pro();
        ll.add_f(5);
        ll.add_f(4);
    //    ll.add_f(3);
        ll.add_f(2);
        ll.add_f(1);
        ll.add_f(0);
        ll.print();
        ll.add_mid(3, 3);
        System.out.println("\n");
        ll.print();
        System.out.println("\n");
        ll.revse();
        ll.print();
        System.out.println("\n");
        ll.remove_end(2);
        ll.print();
    }
}
