import java.util.ArrayList;

public class Linkedlist_as_stack {
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class Stack{
        static Node head=null;
        public boolean isEmpty(){
            return head==null;
        }

        // push
        public void push(int data){
            Node new_nNode=new Node(data);

            if(isEmpty()){
                head=new_nNode;
                return;
            }
            new_nNode.next=head;
            head=new_nNode;
        }

        // pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        //peek

        public int peek(){
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
