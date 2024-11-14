public class Interface_example {
    public static void main(String[] args) {
        Queen q =new Queen();
        q.move();
    }
}

interface chess_plyar{
   void move(); // by defualt it is public 
}
class Queen implements chess_plyar {
   public  void move(){
           System.out.println("left , right , kuch bi");
    }
}

class King implements chess_plyar {
    public  void move(){
            System.out.println("left , right ,.................. kuch bi");
     }
 }
