import java.util.*;
public class factorial {
    public static void factor(int b){
        int fact=1;
        int n=b;
        for(int i=0;i<n;i++){
           fact=b*fact;
           b-=1;
        }
        System.out.println("result  =  " + fact);
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in )) {
            System.out.println("Enter the number=");
            int a = s.nextInt();
            factor(a);
        }

    }
}
