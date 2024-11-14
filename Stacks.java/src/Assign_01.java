import java.util.*;
public class Assign_01 {
  public static class Node {
    char data;
    Node next;
    public Node(char data){
      this.data=data;
      this.next=null;
    }
}

public static Node head;
public static Node tail;
public static boolean isPalindrone(Node head){
  Stack<Character>s=new Stack<>(); 
  Node tmp=head;
  while(tmp!=null){
    s.push(tmp.data);
    tmp=tmp.next;
     }

   while(head!=null){
      char ch= s.pop();
       if(ch!=head.data){
        return false;
       }
       head=head.next;
     }
     return true;
}

//print
public static void print(){
  Node tmep=head;
  while(tmep!=null){
      System.out.print(tmep.data+"-->");
      tmep=tmep.next;
  }
  System.out.println("null");
}
    public static void main(String[] args) {
      head=new Node('a');
      head.next=new Node('b');
      head.next.next=new Node('c');
      head.next.next.next=new Node('d');
      head.next.next.next.next=new Node('e');
      print();
      boolean b= isPalindrone(head);
      System.out.println("Palindrone  "+ b);
    }
  }
