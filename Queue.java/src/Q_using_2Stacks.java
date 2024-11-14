import java.util.*;
public class Q_using_2Stacks {
    public static class Queue{
        Stack<Integer> s1=new Stack<>(), s2=new Stack<>();

        // isEmpty()
        public boolean isEmpty(){
            return s1.isEmpty();
        }
        
        //for Add
        public void add(int data){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                s1.push(data);
                while(!s2.isEmpty()){
                    s1.push(s2.pop());
                }
        }

        // remove()
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        //peek()
        public int peek(){
              if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove()  ;
        }
    }
}
  