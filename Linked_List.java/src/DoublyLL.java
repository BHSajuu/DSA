public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
        public static Node head;
        public static Node  tail;
        public void Add_First(int data){
            Node new_node=new Node(data);
            if(head==null){
                head=tail=new_node;
                return;
            }
            new_node.next=head;
            head.prev=new_node;
            head=new_node; 
       }
       public  void Add_last(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=tail=new_node;
            return;
        }
         new_node.prev=tail;
        tail.next=new_node;
        tail=new_node;
       }
       public void remove_First(){
         if(head==null){
            System.out.println("LL is emmpty");
            return;
         }
         head=head.next;
         head.prev=null;
       }
       public void remove_Last(){
          if(head==null){
            System.out.println("LL is empty");
            return;
          }
          tail.prev.next=null;
          tail=tail.prev;
          tail.prev=null;
       }
       public void print(){
         Node tmp= head;
         while(tmp!=null){
            System.out.print(tmp.data + "<-->");
            tmp=tmp.next;
         }
           System.out.println("null");
       }
    
    public static void main(String[] args) {
        DoublyLL dll =new DoublyLL();
        // dll.Add_First(5);dll.Add_First(4);dll.Add_First(3);dll.Add_First(2);dll.Add_First(1);
        // dll.print();
        dll.Add_last(1);dll.Add_last(2);dll.Add_last(3);dll.Add_last(4);dll.Add_last(5);
        dll.print();
        dll.remove_First();
        dll.print();
        dll.remove_Last();
        dll.print();
    }
}

