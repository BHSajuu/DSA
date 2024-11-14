public class SubArray {
    public static void subarray(int a[]){
        for(int i =0; i< a.length ; i++){
           //System.out.println(a[i] );
            for (int j =i ; j<a.length; j++ ){
                for(int k=i ; k<= j; k++){
                    System.out.print(a[k] );
                }
                System.out.println();
            }
            System.out.println("    ");
            System.out.println("    ");
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        subarray(a);

    }
}
