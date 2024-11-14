import java.util.*;
public class Most_frequent_number {
    public static void main(String[] args) {
        ArrayList<Integer>nums= new ArrayList<>();
        // nums.add(1);
        // nums.add(100);
        // nums.add(2);
        // nums.add(1);
        // nums.add(200);
        // nums.add(1);
        // nums.add(100);
        // nums.add(1);
        // nums.add(200);
        // nums.add(1);
        // nums.add(200);
        // nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        int key=2;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++)
            max=Math.max(max, nums.get(i));
        int result[]=new int[max+1];
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==key){
                result[nums.get(i+1)]++;
            }
        }
        int ans=0;
        int max_frequency=Integer.MIN_VALUE;
        for(int i=0;i<result.length;i++){
               if(result[i]>max_frequency){
                max_frequency=result[i];
                ans=i;
               }
        }
        System.out.println("Target  = "+ans + "  frequency = "+max_frequency);
    }
}
