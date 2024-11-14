import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int wt[]={10,20,30};
        int w=50;
        int value=0;
        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)wt[i];
        }

        // Ascendibg sorting
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        float capacity=w;
        for(int i=val.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=wt[idx]){  // include full item
                value+=val[idx];
                capacity=capacity-wt[idx];
            }
            else{
                value+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("Max Total value = "+value);
    }
}
