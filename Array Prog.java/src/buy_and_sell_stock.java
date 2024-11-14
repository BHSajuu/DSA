public class buy_and_sell_stock {
    public static int stock(int p[]){
        int buy_price = Integer.MAX_VALUE;
        int Max_profit =0;
        /// p[i]= selling price
        for(int i=0 ; i<p.length ; i++){
            if(p[i]> buy_price){ // profit
                int profit= p[i]- buy_price; // today profit
                Max_profit = Math.max(profit,Max_profit);
            }
            else{
                buy_price = p[i]; // buy price update
            }
        }
        return Max_profit;
    }
    public static void main(String[] args) {
        int p[]={7,1,5,3,6,4};
        System.out.println("maximum profit = " + stock(p));
    }
}
