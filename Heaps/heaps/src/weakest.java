import java.util.*;
public class weakest {

    public static class info implements Comparable<info>{
            int soldier;
            int idx;
            public info(int sol,int i){
                this.soldier=sol;
                this.idx=i;
            }
            @Override
            public int compareTo(info r2){
                if(this.soldier == r2.soldier){
                    return this.idx-r2.idx;
                }
                else{
                   return this.soldier - r2.soldier;
                }
            }
    }
    public static void main(String[] args) {
        int arr[][]={{1,0,0,0},
                     {1,1,1,1},
                     {1,0,0,0},
                     {1,0,0,0}
                    };
        int k=2;
        PriorityQueue<info> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            int sol=0;
            for(int j=0;j<arr[0].length;j++){
                sol+=arr[i][j]==1?1:0;
            }
            pq.add(new info(sol, i));
        }
        for(int i=0;i<k;i++){
            System.err.println("R"+pq.remove().idx);
        }
    }
}
