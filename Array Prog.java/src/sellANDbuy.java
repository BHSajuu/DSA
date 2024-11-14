public class sellANDbuy {
    public static int stockbuyindANDselling(int p[]){
        int Max_profit=0;
        for(int i=1; i<p.length; i++){
            int profit = p[i]-p[i-1];
            Max_profit = Math.max(profit,Max_profit);
        }
        return Max_profit;
    }
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        System.out.println("Max profit = " + stockbuyindANDselling(a));
    }
}
