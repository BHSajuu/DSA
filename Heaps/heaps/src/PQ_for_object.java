import java.util.*;
public class PQ_for_object {
    static class Student implements Comparable<Student> {
          String name;
          int rank;
          public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
          }
          @Override  // overriding function 
          public int compareTo(Student s2){
            return this.rank-s2.rank;
          }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq= new PriorityQueue<>();
        pq.add(new Student("saju", 5));
        pq.add(new Student("sha", 2));
        pq.add(new Student("raj", 10));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +"-->" + pq.peek().rank);
            pq.remove();
        }
    }
}
