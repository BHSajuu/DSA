import java.util.*;
public class breakprb {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enter ur number =");
                 while(n>10) {
               int n = s.nextInt();
               if(n % 10 != 0)
                System.out.println(n);
                else
                   break;  
            }
        }
    }
}
