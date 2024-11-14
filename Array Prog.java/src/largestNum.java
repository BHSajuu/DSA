//import java.util.*;
public class largestNum {
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
