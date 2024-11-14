public class in_increasinfOder {
    public static void main(String[] args) {
      IncPrint(10);
    }
    public static void IncPrint(int n){
       if(n>0){
        IncPrint(n-1);
       }
        System.out.println(n);
    }
}
