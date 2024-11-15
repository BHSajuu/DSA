import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    public static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
         this.src=s;
         this.dest=d;
         this.wt=w;
        }
        
     }

     public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
    
      graph[0].add(new Edge(0, 1,2));
      graph[0].add(new Edge(0, 2,4));
    
      graph[1].add(new Edge( 1,3,7));
      graph[1].add(new Edge(1, 2,1));
      
      graph[2].add(new Edge(2, 4,3));
     
      graph[3].add(new Edge(3, 5,1));

      graph[4].add(new Edge(4, 3,2));
      graph[4].add(new Edge(4, 5,5));

    }

    public static void dijkstra(ArrayList<Edge>[] graph,int src){
        int dist[] = new int[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        dist[src] = 0;  // Set the distance to the source itself as 0
        
        boolean visit[]= new boolean[graph.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        pq.add(new int[]{src,0});

        while (!pq.isEmpty()) {
            int curr[] = pq.remove();
            if(!visit[curr[0]]){
                visit[curr[0]]=true;
                //neighbors
                for(int i=0;i<graph[curr[0]].size();i++){
                    Edge e= graph[curr[0]].get(i);
                    int u = e.src; int v = e.dest; int wt = e.wt;
                    if(dist[u] + wt <dist[v]){
                        dist[v]=dist[u] + wt;
                        pq.add(new int[]{v,dist[v]});
                    }
                }
            }
        }
        // print all the shortest distance
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>[] graph= new ArrayList[v];
        createGraph(graph);
       int src=0;
       dijkstra(graph,src);
    }
}
