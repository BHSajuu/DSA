import java.util.*;
public class push_at_bottom {
    public static void pushatbottom(Stack <Integer> s, int data){
        // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        // kaam
        int top=s.pop();
        pushatbottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
      
        pushatbottom(s, 4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
