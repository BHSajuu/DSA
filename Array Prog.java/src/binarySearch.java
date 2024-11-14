 import java.util.*;
 public class binarySearch {
    public static int binaryS(int n[], int k){
        int start = 0; int end = n.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if (n[mid] == k){ // found
                 return mid;
            }
            else if (n[mid] < k ){
                start = mid+1;
            }
            else {
                end = mid - 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
       
        // int n[]={1,5,6,7,9,11,25,89}; // array must be in sorted form 
       Scanner sc =new Scanner(System.in);
       System.out.print(" Enter ur array (MUST BE IN SORTED FORM) = ");
       int n[]= new int[8];
       for(int i=0; i< n.length; i++){
        n[i]=sc.nextInt();
       } 
       System.out.print("\n Enter the element u want to search = ");
       int k = sc.nextInt();
       System.out.println("index of key is = " + binaryS(n,11));

    }
}
