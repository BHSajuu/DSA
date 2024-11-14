public class halfpyramid {
    public static void  pyramid( int r){
        for(int i=1 ; i<= r; i++){
            for(int sp=1; sp<=r-i; sp++){
                System.out.print("  ");
            }
            for(int st = 1; st<=i;i++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
              pyramid(4);
        }
    }

