public class butterfly {
    public static void buterf(int r){
        for(int i=1; i<= r; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int sp=1;sp<= 2*(r-i); sp++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i=5; i<= r; i++){
        //     for(int j=r/2; j>=i;j++){
        //         System.out.print("  *  ");
        //     }
        //     for(int sp=1;sp<= 2*(i-1); sp++){
        //         System.out.print("     ");
        //     }
        //     for(int j=r/2; j>=i;j++){
        //         System.out.print("  *  ");
        //     }
        //     System.out.println();
        // }
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int sp=1;sp<= 2*(r-i); sp++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        buterf(100);
    }
}