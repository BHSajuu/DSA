public class add_1_to_an_integer_using_bit_manipulation {
    public static void main(String[] args) {
        int x=6;
        System.out.println(x+" + "+1+" is "+-~x);
        x= -4;
        System.out.println(x+" + "+1+" is "+-~x);
        x=0;
        System.out.println(x+" + "+1+" is "+-~x);
        x=3;
        System.out.println(-~x);
    }
}
