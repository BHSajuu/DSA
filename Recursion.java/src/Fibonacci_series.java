public class Fibonacci_series {
 public static void main(String[] args) {
       
   System.out.println(printFibonacciSeries(5));   // for only getting nth term of series 

   for(int i=0; i<10;i++){  
   System.out.println( printFibonacciSeries(i)); // for getting whole series i use this method.  
  }
 }


 public static int printFibonacciSeries(int n){
    if((n == 1) || (n==0))
      return n;
    int NminusONE=printFibonacciSeries(n-1);
    int NminusTWO=printFibonacciSeries(n-2);
    int f =  NminusONE + NminusTWO;
    return f;
 }
}
