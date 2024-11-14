public class string_compression {
    public static void compression(String s){
        StringBuilder sb = new StringBuilder(" ");
        Integer count=1;
        for(int i=0 ; i<s.length();i++){
            char ch = s.charAt(i);
            while( i<s.length()-1 && ch == s.charAt(i+1)){
                count++;i++;
            }
           if(count>1){
            sb.append(ch);
            sb.append(count);
           }
           else
           sb.append(ch);
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String s ="aaabbcccdd";
        compression(s);
    }
}
