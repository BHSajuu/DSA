import java.util.*;
public class Container_with_most_water_by_optimaization {
    public static void main(String[] args) {
        ArrayList<Integer>ht=new ArrayList<>();
        ht.add(1);ht.add(8);ht.add(6);ht.add(2);ht.add(5);ht.add(4);ht.add(8);ht.add(3);ht.add(7);
        int maxWater=0;
        int lp=0,rp=ht.size()-1;
        while(lp<rp){
            int width=rp-lp;
            int height=Math.min(ht.get(lp), ht.get(rp));
            int Currwater=width*height;
            if(maxWater<Currwater)
                maxWater=Currwater;
            if(ht.get(lp)<ht.get(rp))
               lp++;
            else
              rp--;
        }
        System.out.println("Most of water = " + maxWater);
    }
}
