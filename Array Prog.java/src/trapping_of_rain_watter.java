import java.util.*;
public class trapping_of_rain_watter {
      public static int rain_watter(int h[]){
           int n = h.length;
        // left max boundary :: array
         int left_max_array[] = new int[n];
         left_max_array[0]=h[0];
         for(int i=1 ; i<n; i++ ){
            left_max_array [i]=Math.max( left_max_array[i-1],h[i]);
         }
        // right max boundary :: array
        int right_max_array[]=new int[n];
        right_max_array[n-1]=h[n-1];
        for(int i= n-2 ; i>=0 ; i--){
            right_max_array[i]= Math.max(h[i],right_max_array[i+1]);
        }
        int trapped_watter = 0;
        for(int i=0 ; i<n ; i++){
            int watter_level = Math.min(right_max_array[i],left_max_array [i]);
            trapped_watter +=watter_level - h[i];
        }
        return trapped_watter;
      }
      public static void main(String[] args) {
        //int a[]={4,2,0,6,3,2,5};
        //System.out.println("please the length of the ");
        System.out.print("please Enter the size of the array =");
        
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int a[]= new int[n];
        System.out.println();
        System.out.print("Enter the heigth of the bars :");
        for(int i=0 ; i<n ; i++){
          a[i]= s.nextInt();
        }

        System.out.println( " total water trapped = " + rain_watter(a));
      }
}
