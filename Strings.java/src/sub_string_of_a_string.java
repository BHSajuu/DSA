public class sub_string_of_a_string {
    public static void substrings(String s, int si,int ei){
        String sum="";
        for(int i=si; i<ei ; i++){
             sum +=s.charAt(i);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        String s="shahida Sultana";
       // substrings(s,0,4);
        System.out.println(s.substring(8,11));
    }
}
