import java.util.*;
public class check_even_odd_of_a_given__number {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a =s.nextInt();
        //int a =3;
      //  int r=3 & 1;
        if((a & 1) ==1)
        System.out.println("odd");
        else if((a&1)==0)
        System.out.println("even");
    }
}
