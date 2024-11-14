import java.util.*;

public class Stack_span_problem {
    public static void Stack_span(int stoke[],int span[] ){
        Stack<Integer> s=new Stack<>();
       // for 1st day
        span[0]=1;
        s.push(0);
        // for remaining days ,i donate per day
        for(int i=1;i<stoke.length;i++){
            int currPrice=stoke[i];
            while(!s.isEmpty() && currPrice>stoke[s.peek()]){
                 s.pop();
            }
            if(s.isEmpty()){
               span[i]=i+1;
            }
            else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }

    }
    public static void main(String[] args) {
        int stoke[]={100,80,60,70,60,85,100};
        int span[]=new int[stoke.length];
        Stack_span(stoke, span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }
    }
}
