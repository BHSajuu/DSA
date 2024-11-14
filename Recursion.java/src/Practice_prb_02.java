public class Practice_prb_02 {
    public static void main(String[] args) {
        recurciveFuction(2019);
    }
    public static void recurciveFuction(int n){
        String strArray[]={"zero","one","two","three","four","five","six","seveen","eight","nine"};
        if(n==0){
        return;
     }
      int   lastDigit = n%10;
      recurciveFuction(n/10);
      System.out.print(strArray[lastDigit]+" ");
    }
}