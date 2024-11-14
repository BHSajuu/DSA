import java.util.ArrayList;
public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);
        list.add(-9);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(10);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size()-1-i;j++){
                if(list.get(j)>list.get(j+1)){
                    int temp=list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
            System.out.print("ArrayLIst in step "+(i+1)+ "  " +list + "\n");
        }
        System.out.println("final list =" + list);
    }
}