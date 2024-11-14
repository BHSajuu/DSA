public class clear_range_of_bits {
  public static void cleaer(int n,int i,int j){
    for(int k=i;k<=j;k++){
        n=n&(~(1<<k));
        System.out.println(n);
    }
    System.out.println();
    System.out.println(n);
  }
    public static void main(String[] args) {
        cleaer(10,2,4);
    }
}
m