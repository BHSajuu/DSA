public class BubbleSortArray {
    public static void bullbesorting(int a[]){
        for(int i=1; i<a.length ; i++){  // for number of turns
            int sowp =0;
            System.out.println( i + "th step  :");
            for(int j=0 ; j<a.length-i ; j++){   
                if(a[j]>a[j+1]){
                    int tem =a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                    sowp ++;
                }
                for(int k=0 ; k<a.length; k++){
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
            if(sowp==1){
                continue;
            }
            else{
                System.out.println("ur array is already sorted ");
            }
        }
        
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        bullbesorting(a);
        System.out.println();
        System.out.print("final sorted array =");
        for(int k=0 ; k<a.length; k++){
            System.out.print(a[k] + " ");
        }
    }
}

