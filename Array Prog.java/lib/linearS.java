 import java.util.*;
 public class linearS {
    public static void main(String[] args) {
        int n[]= new int[10];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<=n.length;i++){
            n[i]=s.nextInt();
        }
        int k=10;
        for(int i=0; i<=n.length;i++){
            if (n[i]==k){
                System.out.println("index = " + i);
            }
        }
    }
}
