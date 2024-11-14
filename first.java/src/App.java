import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
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
