public class Selection_sort {
    public static void selectionSorting(int a[]){
        for(int i=0 ; i< a.length-1 ; i++){
            int Minimum_position= i; // index where the minimum element exist.
            for(int j =i+1; j<a.length ; j++){
                if(a[Minimum_position]>a[j]){  // for increasing order array.
                    Minimum_position = j;
                }
                // if(a[Minimum_position]< a[j]){  // for decreasing order array.
                //     Minimum_position = j; 
                // }
            }
            int temp = a[i];
            a[i]=a[Minimum_position];
            a[Minimum_position]=temp;
        }
    }
    public static void main(String[] args) {
        int a[]={5,4,1,3,2};
        selectionSorting(a);
        System.out.println("the sorted array is = " );
        for(int i=0; i<a.length ; i++){
            System.out.print(a[i] + " ");
        }
    }
}
