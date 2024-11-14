public class mutipule_inheritance_using_interface {
    public static void main(String[] args) {
        Call c = new Call();
        c.display();c.network();
    }
}
interface phone{
    void display();
}
interface sim{
    void network();
}

class Call implements phone,sim{
    public void display(){
        System.out.println("display number ");          
    }
    public void network(){
        System.out.println("connect the call ");
    }
}
