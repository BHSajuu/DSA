import java.util.*;
public class pair_sum_2pointer_method {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum(list, 5,0,list.size()-1));

    }
    public static boolean pairSum(ArrayList<Integer>list,int target,int lp,int rp){
        while(lp<rp){
        if(list.get(lp)+list.get(rp)==target)
                     return true;
        else  if(list.get(lp)+list.get(rp)>target)
                    rp--;
        else 
              lp++;
            }
        return false;
    }
}
