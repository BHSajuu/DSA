import java.util.*; 
public class binaryTodecimal {
    public static void main(String[] args) {
        System.out.print("enter ur binary number  =   " );
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("how many digits in ur given binary numbers");
        double dc= 0;int n = s.nextInt();
        for(int i =0; i<=n;i++){
            int rem = a%10;
            dc+= (rem*Math.pow(2,i));
            a/=10;
        }
        System.out.print("ur drcimal number is  =  " + dc);
    }
}
