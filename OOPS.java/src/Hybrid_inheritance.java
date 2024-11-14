public class Hybrid_inheritance {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
    }
}
class Animals{   /// base class
      void eat(){
        System.out.println("eating");
      }
}
class Fish extends Animals{
    void underwater(){
        System.out.println("under water animals");
    }
}
class Birds extends Animals{
    void flying(){
        System.out.println("Flying animals ");
    }
}
class Mammal extends Animals{
    void ground(){
        System.out.println("ground level animals ");
    }
}
class Tuna extends Fish{
    void chutomass(){
        System.out.println("chuto mass ");
    }
}
class Shark extends Fish{
    void bid(){
        System.out.println("boro mass");
    }
}
class Peacock extends Birds{
    void paki(){
       System.out.println("kobutor         ...........................         ");
    }
}
class Dog extends Mammal{
    void kukur(){
        System.out.println("kukur...........");
    }
}
class Human extends Mammal{
    void ami(){
        System.out.println("ami manush nni 💕😍😊🤣");
    }
}