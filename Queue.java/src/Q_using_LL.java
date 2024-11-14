public class Q_using_LL {
   public static class Node{
      int data;
      Node next;
      Node(int data){
        this.data=data;
        this.next=null;
      }
   }
   public static class Queue{
     public static Node head;
     public static Node tail;
     // isEmpty()
     public  boolean isEmpty(){
       return head==null && tail==null;
     }

     // addition
     public void Add(int data){
      Node new_Node=new Node(data);
      if(isEmpty()){
         head=tail=new_Node;
         return;
      }
      tail.next=new_Node;
      tail=new_Node;
   }
   // subtraction
   public  int remove(){
       if(isEmpty()){
         System.out.println("Queue is Empty");
         return-1;
       }
       int front=head.data;
       // agar sigle element hai toh
       if(head==tail){
         head=tail=null;
       }
       else{
         head=head.next;
       }
       return front;
   }
   // peck()
   public  int  peck(){
     if(isEmpty()){
      System.out.println("Queue is Empty");
      return-1;
     }
     return head.data;
   }
}
public static void main(String[] args) {
   Queue q=new Queue();
   q.Add(1);
   q.Add(2);
   q.Add(3);
   while(!q.isEmpty()){
      System.out.print(q.peck()+ " ");
      q.remove();
   }
   // q.remove();
   //  while(!q.isEmpty()){
   //    System.out.print(q.peck()+ " ");
   // }
}
}

