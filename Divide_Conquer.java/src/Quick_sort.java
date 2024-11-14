import java.util.*;
public class Quick_sort {
    public static void main(String[] args) {
        System.out.print("Enter the number of  elements in the array = ");
        Scanner s= new Scanner(System.in);
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
        quickSort(arr, 0, n-1);
        System.out.print("\n The sorted array is  :");
        for(int i=0; i<n;i++){
            System.out.print(arr[i] + " ");
         }
    }
    public static void quickSort(int a[],int si,int ei){
        // base case 
         if(si>=ei){
            return;
         }
         // kaam
    int Pidx = partition(a,si,ei);
    quickSort(a,si,Pidx-1);
    quickSort(a,Pidx+1,ei); 
    }
    public static int  partition(int a[],int si,int ei){
        int pivot = a[ei];
        int i= si-1;  // to make place for elements smller than pivot
        for(int j=si;j<ei;j++){
            if(a[j]<=pivot){
                i++;
                // swap
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        // ab pivot ko uski sahi position mai la kr aa
        i++;
        int temp = pivot;
        a[ei]=a[i];
        a[i]=temp;
        return i;
    }
}
