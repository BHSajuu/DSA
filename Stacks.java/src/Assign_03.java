import java.util.*;
public class Assign_03 {
   public static String multiply(char n,String new_str){
    int x=(int)n-48;
    String str=new String();
    for(int i=1;i<=x;i++){
           str=str+new_str;
    }
    return str;
   }
    public static void main(String[] args) {
        String str="3[b]";
        Stack<Character> s1= new Stack<>();
        Stack<Character> s2= new Stack<>();
        String str2=new String();
        for(int i=0;i<str.length();i++){
            String str1= new String();
            if(str.charAt(i)=='1' || str.charAt(i)=='2' ||str.charAt(i)=='3' ||str.charAt(i)=='4' ||str.charAt(i)=='5' ||str.charAt(i)=='6' ||str.charAt(i)=='7' ||str.charAt(i)=='8' ||str.charAt(i)=='9' ){
                s1.push(str.charAt(i));
            }
            else if(str.charAt(i)!=']'){
                s2.push(str.charAt(i));
            }
            else if(str.charAt(i)==']'){
                while(s2.peek()!='['){
                    if(!s2.isEmpty()){
                        str1=s2.pop()+str1;
                    }
                }
                 if(!s2.isEmpty()){
                     s2.pop();
                 }
            }
            if(!s1.isEmpty()){
            str2=multiply(s1.pop(),(str1+str2));
            }
        }
        System.out.println(str2);
    }
}
