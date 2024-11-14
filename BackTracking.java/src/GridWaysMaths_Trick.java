import java.util.*;
public class GridWaysMaths_Trick {
   public static int gridwaysfunction(int n,int m){
      int n1=factorial(n-1+m-1);
      int n2=factorial(n-1);
      int n3=factorial(m-1);
      return n1/(n2*n3);
   }
   public static int factorial(int x){
    int fact=1;
    for(int i=1;i<=x;i++){
        fact*=i;
    }
    return fact;
   }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of N and M =");
        int n =s.nextInt();
        int m =s.nextInt();
        System.out.println("total number of ways = " + gridwaysfunction( n, m));
    }
}
