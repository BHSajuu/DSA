public class rectangularPa {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j = 1; j<=5 ; j++){
                // if(i==1 || i==4){
                //     System.out.print(" * ");
                // }
                // else if ((i==2 && j==1)||(i==3 && j==1)||(i==2 && j==5) ||(i==3 && j==5)){
                //     System.out.print(" * ");
                // }
                // else{
                //     System.out.print("");0
                // }
                if (((i==2) && (j==2|| j==3|| j==4)) ||  ((i ==3) && (j==2|| j==3|| j==4))){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
