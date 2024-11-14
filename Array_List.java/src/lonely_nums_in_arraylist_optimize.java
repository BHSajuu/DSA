import java.util.*;
public class lonely_nums_in_arraylist_optimize {
  public static ArrayList<Integer> findlonely(ArrayList<Integer>nums){
    Collections.sort(nums);   // T.C=O(nlogn)
    ArrayList<Integer>lonely=new ArrayList<>();
    for(int i=1;i<nums.size()-1 ;i++){
        if(nums.get(i-1)+1<nums.get(i) && nums.get(i)<nums.get(i+1)-1)
                lonely.add(nums.get(i));
    }
    if(nums.size()==1)
    lonely.add(nums.get(0));
    if(nums.size()>1){
      if(nums.get(0)+1<nums.get(1))
          lonely.add(nums.get(0));
      if(nums.get(nums.size()-1)-1>nums.get(nums.size()-2))
         lonely.add(nums.get(nums.size()-1));
    }
    return lonely;
  }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(7);
        System.out.println(findlonely(list));
}
}