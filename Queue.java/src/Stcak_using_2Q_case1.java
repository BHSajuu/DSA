import java.util.*;
public class Stcak_using_2Q_case1 {
    public static class Stack{
     Queue<Integer> q1=new LinkedList<>();
     Queue<Integer> q2=new LinkedList<>();

     // isempty()

     public boolean isempty(){
        return q1.isEmpty();
     }

     // push()

     public void push(int data){
        if(q1.isEmpty()){
            q1.add(data);
        }
        else{
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(data);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
     }

     // pop()
     public int pop(){
        if(q1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return q1.remove();
     }

     //peek()
     public int peek(){
        if(q1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return q1.peek();
     }
    } 
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isempty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
