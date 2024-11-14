public class diamondPattern {
    public static void diamond(int r){
        for(int i=1;i<=r;i++){
            for(int s=1;s<=(r-i);s++){
                System.out.print(" ");
            }
            for(int s=1; s<=(2*i-1);s++){
                 System.out.print("*");
        
         }
         System.out.println();
        }
        for(int i=r;i>=1;i--){
            for(int s=1;s<=(r-i);s++){
                System.out.print(" ");
            }
            for(int s=1; s<=(2*i-1);s++){
                 System.out.print("#");
        
         }
         System.out.println();
        }

    }
    public static void main(String[] args) {
        diamond(5);
    }
}
