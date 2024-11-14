import java.util.*;

public class Reverse_string_using_stack {
    public  static String revseString(String str){
          Stack<Character> s =new Stack<>();
          int idx=0;
          while(idx<str.length()){
             s.push(str.charAt(idx));
             idx++;
          }
         StringBuilder result=new StringBuilder("");
         while(!s.isEmpty()){
            char cuur=s.pop();
            result.append(cuur);
         }
         return result.toString();
    }
    public static void main(String[] args) {
        String str="shahida";
       String res= revseString(str);
       System.out.println(res);
    }
}
