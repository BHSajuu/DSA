public class Print_n_number_in_decreasing_oder {
    public static void main(String[] args) {
        printrecursion(10);
    }

public static void  printrecursion(int n){
    if (n==1){
        System.out.print(n);
        return;
    }
    System.out.print(n+" ");
    printrecursion(n-1);
}
}
