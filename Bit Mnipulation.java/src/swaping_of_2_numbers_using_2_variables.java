public class swaping_of_2_numbers_using_2_variables {
    public static void swaping(int a, int b){
      a=a^b;
      b=a^b;
      a=a^b;
      System.out.println("After sawping a = " + a + " and b = " +b );  
    }
    public static void main(String[] args) {
        int a=3;int b=4;
        System.out.println("before sawping a = " + a + " and b = " +b );
        System.out.println("/n");
        swaping(a, b);
    }
}
