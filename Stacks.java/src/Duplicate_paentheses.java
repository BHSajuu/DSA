import java.util.*;
public class Duplicate_paentheses {  // T.C=O(n)
    public static boolean duplicate(String str){
     Stack<Character> s=new Stack<>();
     for(int i=0;i<str.length();i++){
        char ch= str.charAt(i);
        // opening
        if(ch!=')'){
             s.push(ch);
        } 

        // closing
        else{
            int count=0;
            while(s.peek()!='('){
                s.pop();
                count++;
            }
           if(count<1)
               return true;
            s.pop();  // to remove '('
        }
     }
        return false;
     }
    public static void main(String[] args) {
        String str="(((a+b))+(c+d))";
        String str1="((a+b)+(c+d))";
        System.out.println(duplicate(str));
        System.out.println(duplicate(str1));
    }
}
