import java.util.*;
public class Interleave_Q {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5); q.add(6); q.add(7); q.add(8); q.add(9); q.add(10);
        int size=q.size();
        Queue<Integer> Frist=new LinkedList<>();
        for(int i=0;i<size/2;i++)
           Frist.add(q.remove());
        while(!Frist.isEmpty()){
            q.add(Frist.remove());
            q.add(q.remove());
        }
        while(!q.isEmpty())
           System.out.print(q.remove()+" ");
    }
}
