import java.util.*;

public class Indian_coins {
    public static void main(String[] args) {
         Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Collections. reverseOrder());
        System.out.print("Enter the ammount = ");
        Scanner s=new Scanner(System.in);
        int ammout=s.nextInt();
        int count=0;
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<ammout){
                while(coins[i]<=ammout){
                  count++;
                  ans.add(coins[i]);
                  ammout-=coins[i];
                }
            }
        }
        System.out.println();
        System.out.println("Minimum no. of notes used for the exchange is = "+count);
       for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i));
        if(i<ans.size()-1){
            System.out.print("  +  ");
        }
       }
    }
}
