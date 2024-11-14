import java.util.*;
 public class StackAndQ_using_Deque {
    public static class Stack{
    Deque<Integer>dq=new LinkedList<>();

    //isempty()
    public boolean isempty(){
       return dq.isEmpty();
    }
     
    // push()
    public void Push(int data){
      dq.addLast(data);
    }

    // Pop()
    public int pop(){
        if(dq.isEmpty()){
            System.out.println("Stack is Empty ");
            return -1;
        }
        return dq.removeLast();
    }

    //peek()
    public int peek(){
        if(dq.isEmpty()){
            System.out.println("Stack is Empty ");
            return -1;
        }
        return dq.getLast();
    }
  }
  public static class Queue{
    Deque<Integer>dq=new LinkedList<>();

    // isempty()
    public boolean isempty(){
        return dq.isEmpty();
    }

    // add()
    public void add(int data){
        dq.addLast(data);
    }

    //remove()

    public int remove(){
        if(dq.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return dq.removeFirst();
    }

    //peek()
    public int peek(){
        if(dq.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return dq.getFirst();
    }
  }
  public static void main(String[] args) {
    Stack s=new Stack();
    s.Push(1);
    s.Push(2);
    s.Push(3);
    while(!s.isempty()){
        System.out.print(s.peek()+" ");
        s.pop();
    }
  System.out.println();

    //Queue 
    Queue q=new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    while(!q.isempty()){
        System.out.print(q.peek()+" ");
        q.remove();
    }
  }
}
