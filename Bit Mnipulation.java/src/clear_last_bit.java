public class clear_last_bit {
    public static void bitmanipulation(int n,int i){
        //int bitmask=~(1<<i);
       int a=0;
        for(int j=0;j<i;j++){
          a= n & ~(1<<j);
            System.out.println(n & ~(1<<j));
        }
        System.out.println();
        System.out.println(a);
    }
    public static void main(String[] args) {
        bitmanipulation(15,2);
    }
}
