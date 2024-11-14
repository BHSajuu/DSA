import java.util.*;
public class permutation {
    public static void find_permutation(String str,String  ans ){
        // base case 
        if(str.length()==0){
            System.out.print("    "+ans);
            return;
        }
        //kaam
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            find_permutation(newstr, ans+curr);
       }
    } 
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.err.print(" enter the string  = ");
        String str = s.nextLine();
        System.out.println("\n");
        find_permutation(str, " ");
    }
}
