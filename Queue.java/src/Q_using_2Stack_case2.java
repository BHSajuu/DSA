import java.util.*;
public class Q_using_2Stack_case2 {
    public static class Queue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        // isempty()
       public boolean isempty(){
        return s1.isEmpty();
       }

       // add()
       public void add(int data){      //T.C=O(1)
          s1.push(data);
       }

       // remove()
       public int remove(){
            if(isempty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int top=-1;
            while(!s1.isEmpty()){
              top=s1.pop();
              if(s1.isEmpty()){
                break;
              }   
              s2.push(top);
            }
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
          return top;
       }

       // peek

       public int peek(){
          if(isempty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int top=-1;
            while(!s1.isEmpty()){
              top=s1.pop();  
              s2.push(top);
            }
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
          return top;
       }
    }
    public static void main(String[] args) {
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
