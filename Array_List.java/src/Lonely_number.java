import java.util.*;
public class Lonely_number {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(7);
        Collections.sort(list);
        // special case for 1st element
        if(!((list.get(0) == list.get(1)) || (list.get(0)+1 == list.get(1)))){
            System.out.println(list.get(0) + " ");
        }
        for(int i=1;i<list.size()-1;i++){
            if(!((list.get(i) == list.get(i+1)) || (list.get(i)+1 == list.get(i+1)) || (list.get(i) == list.get(i-1)+1))){
                System.out.println(list.get(i) + " ");
            }
        }
        // special case for last element 
        int n=list.size()-1;
        if(!((list.get(n) == list.get(n-1)) || (list.get(n)-1 == list.get(n-1)))){
            System.out.println(list.get(n) + " ");
        }
    }
}
