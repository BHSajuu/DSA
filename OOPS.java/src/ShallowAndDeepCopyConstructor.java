public class ShallowAndDeepCopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
         s1.mark[0]=100;
         s1.mark[1]=99;
         s1.mark[2]=98;
         Student s2 = new Student(s1); // copy
         s1.mark[2]=100;
         for(int i=0;i<3;i++){
            System.out.println(s2.mark[i]);
         }
    }
}
class Student{
     int mark[];
    Student(){
        mark = new int[3];
        System.out.println("constructor is called ..................");
    }

    // Shallow copy constructor :
   
    // Student(Student s1){
    //     mark = new int[3];
    //     this.mark=s1.mark;
    // }

    // deep copy constructor :
   
    Student(Student s1){
        mark = new int[3];
        for(int i=0;i<3;i++){
           this.mark[i]=s1.mark[i];
         }
    }
}

// NOTE :: this code is absolutly correct but outpt are may showing wrong this may be bcz of system probelm,u can try this code in code just copying it then it show the correct output.