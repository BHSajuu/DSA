public class Kinght__Tour {
    
    public static void KnightVisit(int[][] board,int n,int i,int j,int count){
       // base case 
         if(i<0 || i>=n || j<0 || j>=n){
           System.out.println("base case 1");
            return;
         }
         if(board[i][j] !=0 ){
            System.out.println("base case 2");
            return;
         }
       // kaam
         board[i][j]=count;

         if(count == n*n-1){
            System.out.println("Displaynig elements");
            for(int x=0;x<n;x++){
                for(int y=0;y<n;y++){
                    System.out.println(board[x][y]+" ");
                }
                System.out.println();
             }
             return;
         }
         System.out.println("calling functrion started");
         KnightVisit(board,n,i+1,j+2,count+1);
         KnightVisit(board,n,i-1,j+2,count+1);
         KnightVisit(board,n,i-2,j+1,count+1);
         KnightVisit(board,n,i-2,j-1,count+1);
         KnightVisit(board,n,i-1,j-2,count+1);
         KnightVisit(board,n,i+1,j-2,count+1);
         KnightVisit(board,n,i+2,j-1,count+1);
         KnightVisit(board,n,i+2,j+1,count+1);
         System.out.println("calling function ended");
         board[i][j]=0;
        return;
    }
    public static void main(String[] args) {
        System.out.println("solving start");
        KnightVisit(new int[8][8],8,0,0,0);
     }
}

