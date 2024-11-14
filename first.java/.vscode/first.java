import java.util.*;
public class first {
    public static void main(String[] args) {
        System.out.println("enter the no.s:-");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int av = (a+b+c)/3;
            System.out.print("result=");
            System.out.println(av);
        }

    }
}
