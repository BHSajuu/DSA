import java.util.Arrays;
public class Insertion_sort {
    public static void insertionsorting(int a[]){
        int j=0;
        for(int i=0 ; i<a.length-1; i++){
            int temp = a[i+1];
            for(j=i; j>=0 ; j--){
                if(a[j]>temp){
                    a[j+1]=a[j];
                }
                else{
                    break;
                }

            }
            a[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int a[]={5,4,1,3,2};
        //insertionsorting(a);
          Arrays.sort(a);  // inbuilt sorting im java.
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]);
        }
    }
}
