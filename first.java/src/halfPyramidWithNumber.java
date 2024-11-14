public class halfPyramidWithNumber {
   public static void  HPWN(int r, int c){
    for(int i=1;i<=r;i++){
        for(int j =1; j<=(c+1)-i; j++){
             System.out.print(j);
        }
        System.out.println();
    }
   }
    public static void main(String[] args) {
        HPWN(100,100);
    }
}
