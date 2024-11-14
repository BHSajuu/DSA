public class heap_Sort {
    
    public static void  heapSort(int arr[]){
        int n=arr.length;
        //step1 : make the max Heap for accending order array
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        // step2 
        // jsut like selection sort
        for(int i=n-1;i>0;i--){  // last se hum sort kr rha honge
            int tmp=arr[0];
            arr[0]=arr[i];
            arr[i]=tmp;
            // called the heapify to make the unsorted part of the again a max heap
            heapify(arr,0,i);
        }

    }
    public static void heapify(int arr[],int i,int size){
        int left =  2*i+ 1;
        int right =  2*i+ 2;
        int maxIdx = i;
        if(left<size && arr[left]>arr[maxIdx]){
            maxIdx=left;
        }
        if(right<size && arr[right]>arr[maxIdx]){
            maxIdx=right;
        }
        if(maxIdx !=i){
            int tmp=arr[maxIdx];
            arr[maxIdx]=arr[i];
            arr[i]=tmp;
            // again call the heapify function for the swaped element 
            heapify(arr, maxIdx, size);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        heapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

    }
}
