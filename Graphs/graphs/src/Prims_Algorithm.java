import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims_Algorithm {

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
    
      graph[0].add(new Edge(0, 1,10));
      graph[0].add(new Edge(0, 2,15));
      graph[0].add(new Edge(0, 3,30));
    
      graph[1].add(new Edge( 1,0,10));
      graph[1].add(new Edge( 1,3,40));
      
      graph[2].add(new Edge(2,0,15));
      graph[2].add(new Edge(2,3,50));

      graph[3].add(new Edge(3, 1,40));
      graph[3].add(new Edge(3, 2,50));

    }

    public static void prim(ArrayList<Edge>[] graph){
        boolean visit[]= new boolean[graph.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);  // it store the destination node with the edge weight
        pq.add(new int[]{0,0});
        int final_cost =0;
        while (!pq.isEmpty()) {
            int[] curr =  pq.remove();
            if(!visit[curr[0]]){
                visit[curr[0]]=true;
                final_cost += curr[1];

               // for adding the neighbor of the current nodes in pq
               for(int i=0;i<graph[curr[0]].size();i++){
                 Edge e = graph[curr[0]].get(i);
                 pq.add(new int[]{e.dest,e.wt});
               }
            }
        }
        System.out.println("final coast = "+final_cost);
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge>[] graph= new ArrayList[v];
        createGraph(graph);
       prim(graph);
      
    }
}
