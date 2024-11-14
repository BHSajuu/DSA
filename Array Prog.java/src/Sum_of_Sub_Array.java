//        Max SubArray Sum by Brute Force method

public class Sum_of_Sub_Array {
    public static void subarray(int a[]){
        //int sum=0;
        int Maxsum = Integer.MIN_VALUE;
        for(int i =0; i< a.length ; i++){
           //System.out.println(a[i] );
            for (int j =i ; j<a.length; j++ ){
                int currsum=0;
                for(int k=i ; k<= j; k++){
                     System.out.print(a[k] +" " );
                     currsum += a[k];
                }
                // if(i==0 && j == (a.length - 1)){
                //     l = sum ;
                // }
               if(Maxsum < currsum){
                Maxsum= currsum;
               }
                System.out.print(" --> sum of  these subarray elements is  = " + currsum );
                System.out.println();
            }
            System.out.println("    ");
            System.out.println("    ");
        }
        System.out.println("The maximum of sum of the array is =" + Maxsum);
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        subarray(a);

    }
}

