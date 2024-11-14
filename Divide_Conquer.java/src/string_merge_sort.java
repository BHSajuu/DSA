import java.util.*;
public class string_merge_sort {
     public static void main(String[] args) {
        System.out.print("PLease enter the no. of elements in the array = ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        String[] arr = new String[n];
        System.out.print("]\n Please enter the elements of the array :: ");
        for(int i=0;i<n;i++)
              arr[i]=s.nextLine();
         
     }
     public static String[] merge_sort(String[] a,int si,int ei){
        // base case
         if(si==ei)
           return {a[si]};
                  //kaam
        int mid = si+ (ei-si)/2;
        String[]arr1 =  merge_sort(a, si, mid);              // left part 
        String[]arr2= merge_sort(a, mid+1, ei);           // right part
        String[]arr3=merge(arr1, arr2);
        return arr3;
     }
     public static  String[] merge( String[]arr1, String[]arr2){

     }
}