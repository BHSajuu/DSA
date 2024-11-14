import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KahnsAlogithm {
    public static class Edge {
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
     }
  
     public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
    
      graph[2].add(new Edge(2, 3));
    
      graph[3].add(new Edge(3, 1));
      
      graph[4].add(new Edge(4, 0));
      graph[4].add(new Edge(4, 1));

      graph[5].add(new Edge(5, 0));
      graph[5].add(new Edge(5, 2));

    }
     
    public static void calInDeg(ArrayList<Edge>[] graph,int inDeg[]){
        for(int i=0;i<graph.length;i++){  // for traversing each vertex of the graph
            for(int j=0; j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                inDeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge>[] graph){
        int inDeg[]= new int[graph.length];
        calInDeg(graph, inDeg);
         Queue<Integer> q = new LinkedList<>();

         for(int i=0; i<inDeg.length ; i++){
            if(inDeg[i]==0){
                q.add(i);
            }
         }

         //bfs
         while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr +" ");

            for(int j=0;j<graph[curr].size();j++){
                Edge e = graph[curr].get(j);
                inDeg[e.dest]--;
                if(inDeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
         }
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>[] graph= new ArrayList[v];
        createGraph(graph);
        topSort(graph);

    }    
}
