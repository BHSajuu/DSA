public class Practice_prb_03 {
    public static void main(String[] args) {
       System.out.println( recurciveFuction("StringLength", 0, 0));
    }
    public static int recurciveFuction(String str, int count,int i){
        if(i==str.length()-1){
            return count;
        }
        count++;
       return recurciveFuction(str, count, i+1);
    }
}
