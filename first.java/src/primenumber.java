// import java.util.*;
// public class primenumber {
//     public static void main(String[] args) {
//        int  count = 0;
//         try (Scanner s = new Scanner(System.in)) {
//             int n = s.nextInt();
//             for(int i=2 ; i<=Math.sqrt(n) ; i++){
//                 if(n%i == 0){
//                    count = 1;
//                 }
//             }
//         }
//         if (count ==1)
//         System.out.println("not  prime number ");
//         else
//         System.out.println("prime number ");
//     }
// }
import java.util.Scanner;

public class FibonacciSeries {
    /**
     * @param n
     */
    public static void fibonacci(int n) {
        int first = 0, second = 1, next, i;

        System.out.print("Fibonacci Series: ");

        for (i = 0; i < n; i++) {
            if (i <= 1)
                next = i;
            else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        fibonacci(n);
    }
}
