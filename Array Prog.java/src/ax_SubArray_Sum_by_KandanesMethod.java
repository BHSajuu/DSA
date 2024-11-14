public class ax_SubArray_Sum_by_KandanesMethod {
    public static void subarray(int a[]){
        int current_sum = 0; int max_sum = Integer.MIN_VALUE;
        for(int i=0 ; i< a.length ;i++){
            current_sum += a[i];
            if(current_sum < 0){
                current_sum = 0;
            }
            if(current_sum > max_sum){
                max_sum = current_sum;
            }
        }
        System.out.println("Max sum = " + max_sum);

    }
    public static void main(String[] args) {
        int a[]={-2,-3,4,-1,-2,1,5,-3};
        subarray(a);
    }
}
