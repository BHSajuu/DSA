import java.util.*;
public class GridWays {
   public static int gridwaysfunction(int i,int j,int n,int m){
         // base case 
         if(i==n-1 && j==m-1)   // conditon for last cell
             return 1;
        else if(i==n || j==m)   // condition for boundary 
              return 0;
      //  kaam
          int w1 =gridwaysfunction(i, j+1,n, m);  // right
          int w2 =gridwaysfunction(i+1, j, n, m); // down
          return w1+w2;
   }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the values of N and M =");
            int n =s.nextInt();
            int m =s.nextInt();
            System.out.println("total number of ways = " + gridwaysfunction(0, 0, n, m));
        }
    }
}
