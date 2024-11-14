public class Binary_string_problem {
    public static void main(String[] args) {
        printbINARstrig(3, 0, "");
    }
    public static void printbINARstrig(int n,int lastplace, String str) // n= size of the string{
    {
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }
      if(lastplace ==0){
        printbINARstrig(n-1, 0, str + "0");
        printbINARstrig(n-1, 1, str + "1");
      }
      else{ 
        printbINARstrig(n-1, 0, str + "0");
        
      }
    }
    
}
