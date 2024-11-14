public class largNum {
//    public static int grtLargst(int numbers[]){
//     int largest = Integer.MIN_VALUE;
//        for(int i=0; i<numbers.length; i++){
//         if(largest < numbers[i]){
//             largest = numbers[i];
//         }
//        }
//        return largest;
//    }
//     public static void main(String[] args) {
//          int numbers[]={1,2,6,3,5};
//          System.out.println("largest number is = " + grtLargst(numbers));
//     }
public static void main(String[] args) {
    int a[]={1,2,6,3,5};
    int tem = a[0];
    for(int i =0;i< 5;i++){
        if(tem < a[i+1]){
            tem=a[i+1];
        }
       }
    System.out.println();
    System.out.println("  The largest number in array is   = " + tem);
}
}
