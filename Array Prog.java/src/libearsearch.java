import java.util.*;
public class libearsearch {
    public static void main(String[] args) {
        int n[]= new int[10];
        System.out.println("Enter the values");
        int r = n.length;
        try (Scanner s = new Scanner(System.in)) {
            for(int i=0; i<r;i++){
                n[i]=s.nextInt();
            }
        }
        int k=10;
        for(int i=0; i<r;i++){
            if (n[i]==k){
                System.out.println("index = " + i);
            }
        }
    }
}
