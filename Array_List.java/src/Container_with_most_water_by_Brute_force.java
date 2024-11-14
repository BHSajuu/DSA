import java.util.ArrayList;
public class Container_with_most_water_by_Brute_force {
    public static void main(String[] args) {
        ArrayList<Integer>ht=new ArrayList<>();
        ht.add(1);ht.add(8);ht.add(6);ht.add(2);ht.add(5);ht.add(4);ht.add(8);ht.add(3);ht.add(7);
        int maxWater=0;
        for(int i=0;i<ht.size();i++){
            for(int j=i+1;j<ht.size();j++){
                   int width=j-i;
                   int height= Math.min(ht.get(i), ht.get(j));
                   int Currwater=width*height;
                   if(maxWater<Currwater)
                      maxWater=Currwater;
            }
        }   
        System.out.println("Most water = "+ maxWater);
    }
}
