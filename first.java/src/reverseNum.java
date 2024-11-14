import java.util.*;
public class reverseNum {
    public static void main(String[] args) {
       int r = 0;
        System.out.println("How many digit in ur number =");
        try (Scanner s = new Scanner(System.in)) {
            int j = s.nextInt();
            System.out.println("Enter ur digit =");
            int n = s.nextInt();
            System.out.println("ur new number =");
            for(int i =0 ; i<j ; i++ ){
                int c = n%10;
                //System.out.print(c);
               r = r*10 + c;
                n /= 10;
            }
            System.out.println("ur reverse number =" + r );
        }

    }
}
