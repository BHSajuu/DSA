public class SolidRombus {
    public static void rombus(int r){
        for(int i=1; i<=r;i++){
            for(int sp =1; sp<=(r-i);sp++){
                System.out.print(" ");
            }
            for(int st=1;st<=r;st++){
                System.out.print("*");

            }
            for(int sp =1; sp<=(i-1);sp++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        rombus(50);
    }
}
