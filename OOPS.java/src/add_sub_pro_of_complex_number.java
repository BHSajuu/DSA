import java.util.*;
public class add_sub_pro_of_complex_number {
    public static void main(String[] args) {
        complex c = new complex();
        Scanner s =new Scanner(System.in);
        System.out.print("enter the 1st imaginary number real part followed by imaginary part = ");
        c.r1 = s.nextInt(); c.i1=s.nextInt(); 
        System.out.print("enter the 2nd imaginary number real part followed by imaginary part = ");
        c.r2 = s.nextInt(); c.i2=s.nextInt(); 
        c.sum(); c.sub(); c.mul();
    }
}
class complex {
    int r1,r2,i1,i2;
    void sum(){
        int sr= r1+r2;
        int si= i1+i2;
        System.out.println("sum of the given imaginary numbers = " + sr +"+ i"+"(" + si + ")" );
    }
    void sub(){
        int sbr= r1-r2;
        int sbi= i1-i2;
        System.out.println("subtraction of the given imaginary numbers = " + sbr +"+ i"+"(" + sbi + ")" );
    }
    void mul(){
        int pr=r1*r2 - i1*i2;
        int pi=r1*i2 + r2*i1;
        System.out.println("Multiplication of the given imaginary numbers = " + pr + "+ i"+"(" + pi + ")");
    }
}
