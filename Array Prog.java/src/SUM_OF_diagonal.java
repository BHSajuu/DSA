public class SUM_OF_diagonal {
    public static void sumRRy(int matrix[][]){
        int sum=0;
        // this is very optimize code 
        for(int i=0 ; i< matrix.length;i++){
            //primary dia
            sum+=matrix[i][i];
            //secondary dia
           if(i!= matrix.length-1-i) // for middle walla single element when row/col is odd
            sum+=matrix[i][matrix.length-1-i];
    
        }
        System.err.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,5},
                        {6,7,8,9,10},
                     {11,12,13,14,15},
                       {16,17,18,19,20},
                       {21,22,23,24,25} };
        sumRRy(matrix);
    }
}
