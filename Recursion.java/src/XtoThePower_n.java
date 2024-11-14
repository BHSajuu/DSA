public class XtoThePower_n {
    public static void main(String[] args) {
        System.out.println(power(5,20));
    }
    // public static int power(int x,int n){
        
    //     if(n==1)
    //       return x;
    //     return(x*power(x, n-1));
    // }
        // Optimized Method
        public static int power(int x,int n){
           if(n==1)
              return x;
              int halfpower= power(x, n/2);
              int halfpowerSq = halfpower*halfpower;
              if(n%2 == 0)
                return halfpowerSq;
                else
                return x*halfpowerSq;
        }
        
    }

