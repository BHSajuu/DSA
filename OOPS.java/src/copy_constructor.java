public class copy_constructor {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.setName("Shahida", "Rumi@123");
        s1.roll_no=1;
        System.out.println(s1.getName() + " " + s1.getPassword() + " "+ s1.roll_no);
        Student s2= new Student(s1);
        s2.roll_no=07; 
        System.out.println(s2.getName() + " " + s2.getPassword() + " "+ s2.roll_no);
    }
}
class Student{
    private String name , password;
    int roll_no;
    void  setName(String name,String password ){
        this.name=name;
        this.password=password;
    }
    String getName(){
        return this.name;
    }
    String getPassword(){
        return this.password;
    }
    Student(){
        System.out.println("constructor is called ");
    }
    Student(Student s1){
          this.name=s1.name;
          this.password=s1.password;
    }

}

