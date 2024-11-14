import java.util.*;
public class calculatorswitch {
    public static void main(String[] args) {
        System.out.println("enter the no.s");
        Scanner s = new Scanner(System.in) {
            int a = s.nextInt();
            int b = s.nextInt();
        //System.out.println ( "enter ur oparator");
            char op = s.next().charAt(0);
            switch(op){
                case '+' : System.out.println( a+b);
                            break;
               case '-' : System.out.println( a-b);
                            break;
               case '*' : System.out.println( a*b);
                            break;
               case '/' : System.out.println( a/b);
                            break;
              default : System.out.println("null");
            }
        }

    }
}
