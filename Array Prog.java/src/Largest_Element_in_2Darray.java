import java.util.*;
public class Largest_Element_in_2Darray {
   public static void Largest_Element(int a[][]){
    int largest = Integer.MIN_VALUE;
    for(int i=0 ;i<a.length; i++){
        for(int j=0; j<a[0].length ; j++){
            largest = Math.max(largest, a[i][j]);
        }
    }
    System.out.println("the lagest elements in the array = " + largest);
   }
   
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Please enter the no. of rows in matrix = ");
        int r = s.nextInt();
        System.out.print(" \n Please enter the no. of columns in matrix = ");
        int c = s.nextInt();
        int matrix[][]= new int[r][c];
        System.out.println("Total no. of elements in ur array is = " + (r*c));
        System.out.println();
        System.out.println("Enter the elements in of the matrix :-");
        for(int i=0 ;i<r; i++){
            for(int j=0; j<c ; j++){
                matrix[i][j]= s.nextInt();
            }
        }
    
   System.out.println("ur matrix is :-");
    for(int i=0 ;i<r; i++){
        for(int j=0; j<c ; j++){
          System.out.print( matrix[i][j] + " ");
        }
        System.out.println();
    }
    Largest_Element(matrix);
 }
}
