import java.util.*;

public class Assign_04 {
    public static void Max_water_trap(int arr[]){
        int max_water=0;
        Stack<Integer>s=new Stack<>();
        // next greater from left
        int nextGl[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty())
               nextGl[i]=-1;
            else{
                nextGl[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextGl.length;i++){
            System.out.print(nextGl[i]+"  " );
        }
         // next greater from right
          s=new Stack<>();
        int nextGR[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty())
               nextGR[i]=-1;
            else{
                nextGR[i]=arr[s.peek()];
            }
            s.push(i);
        }
        System.out.println();
        for(int i=0;i<nextGR.length;i++){
            System.out.print(nextGR[i]+"  " );
        }
        //finding water content
         for(int i=0;i<arr.length;i++){
            int NGL=0,NGR=0;
            while(i>=0 && nextGl[i]>=NGL){    /// next greatest bar from left
                  NGL=nextGl[i];
                  i--;
            }
             while(i<arr.length-1 && nextGR[i]>=NGR ){    /// next greatest bar from left
                  NGR=nextGR[i];
                  i++;
            }
            int water_level=Math.min(NGL, NGR);
          if(arr[i]<max_water){
              max_water+=water_level-arr[i];
          }
        }
        System.out.println("water trapped after rain ="+ max_water);
    }
    public static void main(String[] args) {
        int arr[]={7,0,4,2,5,0,6,4,0,5};
        Max_water_trap(arr);
    }
}
