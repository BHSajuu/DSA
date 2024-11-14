public class Static_keyword {
    public static void main(String[] args) {
        Test t = new Test();
        Test.change();
        System.out.println(Test.a + Test.b);
    }
}
class Test {
    static int a =10;
    static int b;
    static void change(){
        b=a*3;
    }
}
