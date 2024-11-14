import java.util.*;
public class connect_N_ropes {
    public static int minCost(int ropes[]){
        
        PriorityQueue<Integer>arr= new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            arr.add(ropes[i]);
        }
        int sum=0;
        int currsum=arr.remove()+arr.remove();
        sum+=currsum;
        while(arr.size()>0){
            arr.add(currsum);
            currsum=arr.remove()+arr.remove();
            sum+=currsum;
        }
        return sum;
    }
    public static void main(String[] args) {
        int ropes[]={2,3,3,4,6};
        System.out.println(minCost(ropes));
    }
}
