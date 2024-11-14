public class Tiling_problem {
    public static void main(String[] args) {
       for(int i=20; i>0;i--){
        System.out.println("total no. of ways = " + Tiling_problemFunction(i));

       }
    }
    public static int Tiling_problemFunction(int n){ // floor = 2*n
        if(n==0 || n==1){                  // base case 
            return 1;
        }
        // choice 
        // Horigontal
        int h = Tiling_problemFunction(n-1);
        // Vertical 
        int v= Tiling_problemFunction(n-2);
        return (h+v); // total ways
        
    }
}
