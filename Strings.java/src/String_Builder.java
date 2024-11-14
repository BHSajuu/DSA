public class String_Builder {
   // updating string using stringBuilder
    public static void stringbuilder_in_java(StringBuilder sb){
    for(char ch= 'a' ; ch<='z';ch++){
        sb.append(ch  +" ");
    } 
    System.out.println("from stringbuilder ");
    System.err.println(sb);
   }
   // updating normal string
   public static void stingupdating(String s){
    for(char ch= 'a' ; ch<='z';ch++){
       s+=ch + " ";
    } 
    System.out.println("from  normal string ");
    System.err.println(s);
   }
    public static void main(String[] args) {
        String s ="";
        StringBuilder sb =new StringBuilder("");
        stringbuilder_in_java(sb);
        stingupdating(s);
    }
}
