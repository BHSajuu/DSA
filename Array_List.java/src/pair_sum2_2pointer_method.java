    import java.util.*;
    public class pair_sum2_2pointer_method  {
        public static void main(String[] args) {
            ArrayList<Integer>list=new ArrayList<>();
            list.add(11);
            list.add(15);
            list.add(6);
            list.add(8);
            list.add(9);
            list.add(10);
            System.out.println("_____________________"+pairSum(list, 16)+"______________________");
    
        }
        public static boolean pairSum(ArrayList<Integer>list,int target){
         int bp=-1;
         int n=list.size();
         for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1))
            {
              bp=i;
              break;
            }
         }
              int rp=bp; //largest
              int lp=bp+1; // smallest
            while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target)
                         return true;
            else  if(list.get(lp)+list.get(rp)>target)
                        rp=(n+rp-1) % n;
            else 
                  lp=(lp+1) % n;
                }
            return false;
        }
    }
    
