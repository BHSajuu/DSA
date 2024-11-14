public class Add_and_remove {
   // Node class
    public static class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // Addition of element in LinkedList

    // Add First
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

    // Add Last
    public void addlast(int data){
        Node new_node= new Node(data);
        size++;
        if(head==null){
            head=tail=new_node;
            return;
        }
        tail.next=new_node;
        tail = new_node;
    }

    // Add Middle
    public void addMiddle(int idx,int data){
        // when idx=0
         if(idx==0){
            addFirst(data);
            return;
         }
        Node new_Node = new Node(data);
        size++;
        Node temp= head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // i=idx-1 ; temp-->previous
        new_Node.next = temp.next;
        temp.next=new_Node;
    }

    // remove of a element from LinkedList

    // remove First 
    public int removeFirst(){
        if(size==0){
            System.out.println("ll  is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    // remove Last
    public int removeLast(){
        if(size==0){
            System.out.println("ll  is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val =tail.data;
        Node prev=head;
        for(int i=0; i<size-2;i++){
            prev=prev.next;
        }
         prev.next=null;
         tail=prev;
         size--;
         return val;
    }
    // Display LinkedList 
    public void print(){
        Node tmep=head;
        while(tmep!=null){
            System.out.print(tmep.data+"-->");
            tmep=tmep.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
       Add_and_remove ll = new Add_and_remove();
       ll.print();
       ll.addFirst(2);
       ll.print();
        ll.addFirst(1); 
        ll.print();
       ll.addlast(3); 
       ll.print();
       ll.addlast(4);
       ll.print();
       ll.addMiddle(2, 10);
       ll.print();
       ll.removeFirst();
       ll.print();
       ll.removeLast();
       ll.print();
       System.out.println(ll.size);
    
    }
}
