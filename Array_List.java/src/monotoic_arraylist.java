import java.util.*;
public class monotoic_arraylist {
  static int counter_1=0,Counter_2=0;
    public static boolean monotonic(ArrayList<Integer>nums){
      for(int i=0;i<nums.size()-1;i++){
        if(nums.get(i)<=nums.get(i+1) )
            counter_1 ++;
       if(nums.get(i)>=nums.get(i+1) )
            Counter_2 ++;
      }
      if(counter_1==nums.size()-1)
          return true;
       if(Counter_2==nums.size()-1)
          return true;
     return false;
   }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(1);
        System.out.println(monotonic(list));
    }
}
