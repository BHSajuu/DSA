import java.util.*;

public class Max_length_chain {
    public static void main(String[] args) {
        int arr[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(arr,Comparator.comparingDouble((o -> o[1])));
        int maxLength=1;  //  since 1st pair ka length toh lena hi hoga ,okay
        int  lastPairEnd=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>lastPairEnd){
               maxLength++;
               lastPairEnd=arr[i][1];
            }
        }
        System.out.println("Max lenght chain of pairs = "+maxLength);
    }
}
