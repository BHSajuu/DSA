import java.util.*;

public class primeno {
   public static void rprime(int a){
   int c = 0;
    for(int i=2; i<=Math.sqrt(a);i++){
         if ( a%i == 0){
            c=1;            break;
         }
    }
        if(c==0){
            System.out.print(a + " , ");
        }
   }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter ur range");
            int st = s.nextInt();
            System.out.println("to");
            int ed = s.nextInt();
            System.out.print("prime numbers are  :-");
            for(int i = st; i <= ed ; i++){
                rprime(i);
            }
        }

    }
}
