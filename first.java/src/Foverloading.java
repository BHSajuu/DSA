import java.util.*;
public class Foverloading {
    public static int sum (int n1, int n2){
        return n1+n2;
    }
    public static int sum (int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public static void main(String[] args) {
       //try (Scanner s = new Scanner(System.in)) {
         //   int a = s.nextInt();
            // int b = s.nextInt();
             //int c = s.nextInt();
      //int m = sum(a,b);
      //int n = sum(a,b,c);
      System.out.println("1st two number sum"+ sum(5,6));
      System.out.println("three number sum"+ sum(5,6,7));
        }
    }

