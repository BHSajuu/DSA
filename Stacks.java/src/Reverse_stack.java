import java.util.*;

public class Reverse_stack {
    ////// push at bottom
    public static void pushBottom(Stack<Integer> s,int data){
       // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        // kaaam
        int top=s.pop();
        pushBottom(s, data);
        s.push(top);
    }
   // reverse a stack
   public static void reverse(Stack<Integer>s){
    // base case 
     if(s.isEmpty()){
        return;
     }
    //kaam
    int top=s.pop();
    reverse(s);
    pushBottom(s, top);
   }
   public static void print(Stack<Integer> s){
    while(!s.isEmpty()){
      System.out.println(s.peek());
    s.pop();
    }
   }
   public static void main(String[] args) {
    Stack<Integer> s=new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    
    reverse(s);
    print(s);
    
   }
}
