
// comparing two string according Lexicographic method

public class compareTo_function {
     public static void main(String[] args) {
        String fruite[]={"apple","mango","banana"};
        String largest_String=fruite[0];
        for(int i=1;i<fruite.length;i++){
              if(largest_String.compareTo(fruite[i])<0){
                 largest_String = fruite[i];
              }
        }
        System.out.println(largest_String);
     }
}
