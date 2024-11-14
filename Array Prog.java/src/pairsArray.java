public class pairsArray {
    public static void main(String[] args) {
        int a[]  = {2,5,7,8,9};
        int total_number_of_element =5;
        for(int i=0 ; i<5 ; i++){
            for(int j =i+1 ; j<5; j++){
                System.out.print("(" + a[i] + "," + a[j] + ")");
            }
            System.out.println();
        }
        int Total_pairs = (total_number_of_element*(total_number_of_element -1))/2;
        System.out.println("Total number of pairs = " + Total_pairs);
    }
}
