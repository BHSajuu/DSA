public class Shallow_and_Deep_copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        //  s1.name="Shahida";
        //  s1.roll=1;
         s1.mark[0]=100;
         s1.mark[1]=99;
         s1.mark[2]=98;
         Student s2 = new Student(s1); // copy
         //s2.roll=2;
         s1.mark[2]=100;
         for(int i=0;i<3;i++){
            System.out.println(s2.mark[i]);
         }
    }
}
class Student{
    //  String name ;
    //  int roll;
     int mark[];
    Student(){
        mark = new int[3];
        System.out.println("constructor is called ..................");
    }

    // Shallow copy constructor :
   
    // Student(Student s1){
    //     mark = new int[3];
    //     this.name=s1.name;
    //     this.mark=s1.mark;
    // }

    // deep copy constructor :
   
    Student(Student s1){
        mark = new int[3];
     //   this.name=s1.name;
        for(int i=0;i<3;i++){
           this.mark[i]=s1.mark[i];
         }
    }
}
