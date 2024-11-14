
public class check_is_a_number_power_of_2 {
    public static boolean checking(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
       System.out.println( checking());
    }
    
