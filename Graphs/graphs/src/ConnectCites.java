import java.util.PriorityQueue;

public class ConnectCites {

    public static int connectingCities(int cities[][]){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->a[1]-b[1]);
        boolean visit[] = new boolean[cities.length];

        pq.add(new int[]{0,0});
        int final_cost = 0;

        while (!pq.isEmpty()) {
            int curr[] = pq.remove();
            if(!visit[curr[0]]){
                visit[curr[0]]= true;
                final_cost+= curr[1];

                // add the curr[0] neigthbor to the prority Queue
                for(int i=0;i<cities[curr[0]].length;i++){
                    if(cities[curr[0]][i] != 0){   // means jaha par Edge ka value 0 hai ,woha par path exit hi nhi krti
                       pq.add(new int[]{i,cities[curr[0]][i]});
                    }
                }
            }
        }
        return final_cost;
    }
    public static void main(String[] args) {
        int cities[][]= {{0,1,2,3,4},
                         {1,0,5,0,7},
                         {2,5,0,6,0},
                         {3,0,6,0,0},
                         {4,7,0,0,0}};
     System.out.println(connectingCities(cities));
    }
}
