import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         ArrayList<Integer> saju= new ArrayList<>();
         saju.add(2);  saju.add(5);  saju.add(8);  saju.add(1);
         System.err.print(saju + "   \n");
         saju.add(1, 1);
         System.err.print(saju + "   \n");
    }
}
