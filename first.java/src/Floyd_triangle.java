public class Floyd_triangle {
    public static void floyd(int r){
       int countr = 1;
        for(int i=1 ; i<=r ; i++){
            for(  int j=1; j<=i ; j++){
                System.out.print(countr + "  ");
                countr++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyd(100);
    }
}
