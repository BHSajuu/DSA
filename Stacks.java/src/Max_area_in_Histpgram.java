import java.util.*;

public class Max_area_in_Histpgram {
    public static void Findmaxarea(int height[]){
        int nsl[]=new int[height.length];
        int nsr[]=new int[height.length];
        int max_area=0;

        // next smaller from right   -->T.C=O(n)
          Stack<Integer>s =new Stack<>();
          for(int i=height.length-1;i>=0;i--){
              while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
              }
              if(s.isEmpty())
                 nsr[i]=height.length;
              else
                nsr[i]=s.peek();
             s.push(i);
          }
        // next smaller from left  -->T.C=O(n)

         s =new Stack<>();
         for(int i=0;i<height.length;i++){
              while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
              }
              if(s.isEmpty())
                 nsl[i]=-1;
              else
                nsl[i]=s.peek();
             s.push(i);
          }

          //curr area : width = j-i-1=nsr[i]-nsl[i]-1
          for(int i=0;i<height.length;i++){
            int H=height[i];
            int width=nsr[i]-nsl[i]-1;
            int curr_area=H*width;
            max_area=Math.max(curr_area, max_area);
          }
         System.out.println("Max area is = " + max_area);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
       Findmaxarea(arr);
  
    }
}
