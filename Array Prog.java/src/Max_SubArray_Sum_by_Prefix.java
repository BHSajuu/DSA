public class Max_SubArray_Sum_by_Prefix {
    public static void Maxsubarray(int a[]){
        int prefix_array[] = new int[a.length]; int current_sum =0;
        int max_sum = Integer.MIN_VALUE;
        prefix_array[0]=a[0]; 
        for(int i=1 ; i<a.length; i++){
            prefix_array[i] = prefix_array[i-1] + a[i];  
        }
        for(int i =0 ; i<a.length ; i++){
          int   start = i;
          for(int j =i ;j<a.length; j++){
           int  end = j;
             current_sum = start == 0? prefix_array[end] : prefix_array[end] - prefix_array[start -1];  // ternry operator is used and the value return by it ,store in currentsum
            if(current_sum > max_sum){
                max_sum = current_sum;
            }
          }
        }
        System.out.println("Max sum =" + max_sum);
    }
    public static void main(String[] args) {
        int a[]={-2,-3,4,-1,-2,1,5,-3};
        Maxsubarray(a);
    }
}
