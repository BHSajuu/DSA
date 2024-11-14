public class Search_in_sorted_2Darray {
    public static void searching(int a[][],int key){
        // taken the cell ((row-1) , 0)
        int row=a.length-1; int col =0;
        while(row>=0 && col<=a[0].length){
            if(a[row][col]==key){
                System.out.println("Found at cell ("+row + ","+ col +")");
                break;
            }
            else if(key>a[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
    } 
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,5},
                        {6,7,8,9,10},
                     {11,12,13,14,15},
                       {16,17,18,19,20},
                       {21,22,23,24,25} };
                       searching(matrix,14);
    }
}
