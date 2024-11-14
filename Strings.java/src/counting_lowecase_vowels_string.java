import java.util.*;
public class counting_lowecase_vowels_string {
    public static void cpunting(String s){
        int count =0 ;
        for(int i=0 ; i<s.length(); i++){
            char ch =s.charAt(i) ;
            if((ch == 'a')||(ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u') ){
                count++;
            }
        }
        System.out.println(count + "  times the lowercase vowels occers");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string = ");
        String s= sc.nextLine();
        cpunting(s);
    }
}
