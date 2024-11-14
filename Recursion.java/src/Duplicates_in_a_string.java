import java.util.Map;

public class Duplicates_in_a_string {
    public static void main(String[] args) {
        String[] words={"abc","saju"};
        String word=words[0];
        System.out.println(word.charAt(0));
        // removeDuplicatesFuction("appnnacollege", 0, new StringBuilder(""), new boolean[26]);
    }
    public static void removeDuplicatesFuction(String str,int idx,StringBuilder newstr, boolean map[]){
        if(idx == str.length()){al
            System.out.println(newstr);
            return;
        }
        //kaam
        char curr_char=str.charAt(idx);
        if(map[curr_char-'a']== true){
              // Duplicate case  --> matlab already yeh char str mai present ha 
              removeDuplicatesFuction(str,idx+1,newstr,map);
        }
        else{
            map[curr_char-'a']= true;  // for aga aana walla char k liye ,agr asa nhi karunga to iska bad agr same 
                                       //char dubara aaya toh newstr mai add ho jaya ga q ki complier daka ga ki map
                                        //  k ador to false iska matlab yeh char phela aaya hi nhi, so.......  
         removeDuplicatesFuction(str,idx+1,newstr.append(curr_char),map);
        }                               
    }
}
