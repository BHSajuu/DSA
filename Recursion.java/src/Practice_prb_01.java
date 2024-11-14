import java.util.*;
public class Practice_prb_01 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.print("please enter the size of the array = ");
       int n=s.nextInt();
        int ar[]=new int[n];
        System.out.println();
        System.out.print(" please, enter the elements of the array : ");
        for(int i=0;i<n;i++)
          ar[i]=s.nextInt();
          System.out.println("please, enter the key ");
          int k = s.nextInt();
          recurciveFuction(ar, 0, k);
    }
    public static void recurciveFuction(int a[], int idx,int key){
       //base case
       if(idx==a.length){
        return;
       }
        //kaam
        if(a[idx]==key){
            System.out.print(idx +",");
            recurciveFuction(a, idx+1, key);
        }
        else{
            recurciveFuction(a, idx+1, key);
        }
    }
}
