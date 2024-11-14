import java.util.*;
public class Mini_abs_diff {
   public static void main(String[] args) {
     int a[]={4,1,8,7};
    int b[]={2,3,6,5};
      Arrays.sort(a);
      Arrays.sort(b);
      int mini_sum=0;
      for(int i=0;i<a.length;i++){
        if(a[i]>b[i]){
            mini_sum+=a[i]-b[i];
        }
        else{
                mini_sum+=b[i]-a[i];
        }
      }
      System.out.println("Minimum Absolute value is : "+mini_sum);

   }
}
