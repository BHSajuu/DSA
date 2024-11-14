
    import java.util.*;
    public class App {
    public static boolean canConstruct(String ransomNote, String magazine,int  i,int j) {
         // base case 
            if(i==ransomNote.length()|| magazine.length()==0)
                 return true;
         // recursion
             if(ransomNote.charAt(i)==magazine.charAt(j)){ //String newstr=str.substring(0, i)+str.substring(i+1);
                 String new_magazine=magazine.substring(0,j)+magazine.substring(j+1); 
                 if(canConstruct(ransomNote,new_magazine,i+1,j+1))
                       return true;
             }
             canConstruct(ransomNote,magazine,i,j+1);
             return false ;
    }

public static void main(String[] args){
    Scanner s = new Scanner(System.in);
        System.out.println("enter ransomNote and magazine =");
        String r=s.nextLine();
        String m=s.nextLine();
        if(canConstruct(r,m,0,0)){
            System.out.println("true");
        }
        else 
            System.out.println("false");
   }
}

