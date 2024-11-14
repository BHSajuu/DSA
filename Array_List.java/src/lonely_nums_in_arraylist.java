import java.util.*;
public class lonely_nums_in_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(7);
        for(int i=0;i<=list.size()-1;i++){
            int count=0;
            for(int j=0; j<=list.size()-1;j++){
                if(i!=j && list.get(i)==list.get(j))
                     count++;
                if(list.get(i)+1==list.get(j))
                   count++;
                if(list.get(i)-1==list.get(j))
                   count++;
            }
            if(count==0)
               System.out.print(list.get(i) + " ");
        }
    }

}
