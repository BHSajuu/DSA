public class Spiral_Matrix {
    public static void printspiralmatrix(int matrix[][]){
        int StartRow=0, Startcol=0, endRow= matrix.length-1,endcol= matrix[0].length-1;
        while(StartRow<=endRow && Startcol<=endcol){
            //top part of spiral --> row fixed
            for(int j=Startcol ; j<=endcol ; j++ ){
              System.out.print(matrix[StartRow][j]+" ");
            }
              //right part of spiral --> col fixed
              for(int i=StartRow+1 ; i<=endRow ; i++ ){
                System.out.print(matrix[i][endcol]+" ");
              }
                //bottm part of spiral --> row fixed
            for(int j=endcol-1 ; j>=Startcol ; j-- ){
                if(Startcol == endcol){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
              }
               //left part of spiral --> col fixed
               for(int i=endRow-1 ; i>=StartRow+1 ; i--){
                if(StartRow==endRow){
                    break;
                }
                System.out.print(matrix[i][Startcol]+" ");
              }
              StartRow++; Startcol++;endRow--;endcol--;    
        }
        System.out.println();;
    }
    public static void main(String[] args) {
        // int matrix[][]={{1,2,3,4,5},
        //                 {6,7,8,9,10},
        //                 {11,12,13,14,15},
        //                 {16,17,18,19,20},
        //                 {21,22,23,24,25} };
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
                        printspiralmatrix(matrix);          
    } 
}
