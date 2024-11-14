import java.util.Arrays;
import java.util.Collection;
public class Inbuilt_sorting {
    public static void main(String[] args) {
        Integer a[]={11,5,8,3,4,2,9,7,0,45};
        //Arrays.sort(a);
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]);
        }
      //  Arrays.sort(a,0,4);
        System.out.println();
        for(Integer i=0 ; i<a.length ; i++){
            System.out.print(a[i]);
        }
         Arrays.sort(a,Collections.reverseorder());
    }
}
