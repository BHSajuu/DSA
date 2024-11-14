import java.util.*;
public class Assign_02 {
    public static void main(String[] args) {
        String str="home/";
        Stack<String> s =new Stack<>();
        for(int i=0;i<str.length();i++){
            StringBuilder sb=new StringBuilder("");
            char ch=str.charAt(i);
            while(i<str.length() && ch!='/'){
                   sb.append(ch);
                   ch=str.charAt(++i);
            }
            String curr_str=sb.toString();
            if(curr_str.equals(".")==true){
              continue;
            }
            else if (curr_str.equals("..")==true){
               if(!s.isEmpty())
                   s.pop();
            }
            else if(curr_str.length()!=0){
                s.push(curr_str);
            }
        }
        while(!s.isEmpty()){
             System.out.print("/"+s.pop());
        }
       }
}
