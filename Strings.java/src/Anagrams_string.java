// string sheet question no:-5
import java.util.*;
// this is my method::
public class Anagrams_string {
    public static void anagrams_my(String s1,String s2){
        int count =0;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    count++;
                }
            }
        }
        if(count == s1.length()){
            System.out.println("s1 & s2 are Anagrams strings");
        }
        else{
            System.out.println("s1 & s2 are NOT Anagrams strings");
        }
    } 
    // this maam method::
    public static void anagrams_maam(String s1, String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length() == s2.length()){
            char[] char_array_of_s1 =s1.toCharArray();
            char[] char_array_of_s2 = s2.toCharArray();
            //sorting the arrays
            Arrays.sort(char_array_of_s1);
            Arrays.sort(char_array_of_s2);
            Boolean comp = Arrays.equals(char_array_of_s1, char_array_of_s2);
            if(comp == true)
            System.out.println("s1 & s2 are Anagrams strings");
            else{
                System.out.println("s1 & s2 are NOT Anagrams strings");
            }
        }
        else{
            System.out.println("s1 & s2 are NOT Anagrams strings");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the 1st string = ");
        String s1 = sc.nextLine();
        System.out.print("Enter the 2nd string = ");
        String s2 = sc.nextLine();
        //anagrams_my(s1,s2);
        anagrams_maam(s1,s2);
    }
}
