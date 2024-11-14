public class Search_i {
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
    public void addfisrt(int data){
       Node new_node=new Node(data);
       size++;
        if(head == null){
          head=tail=new_node;
        }
        new_node.next=head;
        head=new_node;
    }
    public int search(int key){
        Node temp =head;
        int i=0;
        while(temp!=null){
            if(temp.data==key)
                return i;
            temp=temp.next;
            i++;
        }
            return -1;
        }

    public static void main(String[] args) {
        Search_i ll = new Search_i();
        ll.addfisrt(9); ll.addfisrt(3); ll.addfisrt(1); ll.addfisrt(6); ll.addfisrt(9);
        System.out.println(ll.search(3));
        
    }
}
