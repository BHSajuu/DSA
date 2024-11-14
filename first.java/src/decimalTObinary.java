import java.util.*;
public class decimalTObinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter ur decimal number  = ");
        int a = s.nextInt();
        int rem =0;
        int be=0; int i=0;
        while(a>0){
           rem = a%2;
           be +=rem*Math.pow (10,i);
           a/=2;
           i++;
        }
        System.out.println("    ");
        System.out.print("ur binary number is = " + be);
    }
}
