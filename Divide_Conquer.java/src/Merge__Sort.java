import java.util.*;
public class Merge__Sort {
    public static void main(String[] args) {
        System.out.print("Enter the number of  elements in the array = ");
        Scanner s = new Scanner(System.in);
         int n = s.nextInt(); 
        int arr[]=new int[n];
        System.out.print("\n Enter the elements of the array :");
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print(" \n your unsorted array is   :");
        for(int i=0; i<n;i++){
           System.out.print(arr[i] + " ");
        }
        mergeSort(arr, 0, n-1);
        System.out.print("\n The sorted array is  :");
        for(int i=0; i<n;i++){
            System.out.print(arr[i] + " ");
         }
    }
    public static void mergeSort(int a[],int si,int ei){
       // base 
       if(si>=ei){
        return;
       }
        ///kaam
        int mid =si+((ei-si)/2);
        mergeSort(a, si, mid);              // left part
        mergeSort(a, mid+1, ei);           // right part
        merge(a,si,mid,ei);   /// merge method to merge the sorted part
    }
    public static void merge(int ar[],int si,int mid,int ei){
        int tem[]=new int[(ei-si+1)];
        int i=si;           // iterator for left part
        int j=mid+1;        // iterator for right part
        int k=0;             // iterator for tem array
        while(i<=mid && j<=ei){
             if(ar[i]<ar[j]){
                tem[k++]=ar[i++];
             }
             else{
                tem[k++]=ar[j++];
             }
        }
        while(i<=mid){
            tem[k++]=ar[i++];
        }
        while(j<=ei){
            tem[k++]=ar[j++];
        }
        for( k=0,i=si;k<tem.length;k++,i++){
            ar[i]=tem[k];
        }
    } 
}
