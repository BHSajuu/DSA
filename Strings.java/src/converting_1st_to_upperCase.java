public class converting_1st_to_upperCase {
  public static void converting(String s){
    StringBuilder sb = new StringBuilder(" ");
    sb.append(Character.toUpperCase(s.charAt(0)));
    for(int i =1; i<s.length(); i++){
        if(s.charAt(i-1)==' '){
            sb.append(" ");
            sb.append(Character.toUpperCase(s.charAt(i)));
        }
        else{
            sb.append(s.charAt(i));
        }
    } 
     System.out.println(sb);
  }
    public static void main(String[] args) {
        String s="hi, i am shradha";
        converting(s);
    }
}
