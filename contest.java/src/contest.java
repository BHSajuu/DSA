 import java.util.*;

public class contest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Length of the array
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt(); // Read the array elements
            }

            int evenSum = 0;
            int oddSum = 0;

            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    evenSum += arr[j];
                } else {
                    oddSum += arr[j];
                }
            }

            int result = Math.abs(evenSum - oddSum);
            System.out.println(result);
        }
    }
}


