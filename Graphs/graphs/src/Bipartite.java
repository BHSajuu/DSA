import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Bipartite {
    
    
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

  graph[0].add(new Edge(0, 1));
  graph[0].add(new Edge(0, 2));

  graph[1].add(new Edge(1, 0));
  graph[1].add(new Edge(1, 3));

  graph[2].add(new Edge(2, 0));
  graph[2].add(new Edge(2, 4));

  graph[3].add(new Edge(3, 1));
  graph[3].add(new Edge(3, 4));
  
  graph[4].add(new Edge(4, 2));
  graph[4].add(new Edge(4, 3));
}

public static boolean isBipartite(ArrayList<Edge>[] graph){
      int[] color = new int[graph.length];
      Arrays.fill(color, -1);
      Queue<Integer> q = new LinkedList<>();

      for(int i=0; i<graph.length; i++){
        if(color[i]==-1){    //BFS
           q.add(i);
           color[i]=0;   // say we give yello color you may give blue also
           while (!q.isEmpty()) {
              int curr=q.remove();
              for(int j=0; j<graph[curr].size() ; j++){  // for neighbors
                   Edge e = graph[curr].get(j);
                   if(color[e.dest]==-1){   // case where neighbor has no color 
                       int nextCol = color[curr] == 0? 1 : 0;  // for finding the alternative color 
                       color[e.dest]=nextCol;
                       q.add(e.dest);
                   }
                   else if(color[e.dest] == color[curr]){  // case where neighbor color is samse ase node color i.e not Bipartite
                         return false;
                   }
              }
           }
        }
      }
      return true;
 } 
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>[] graph= new ArrayList[v];
        createGraph(graph);
        System.out.print("The outPut is : ");
        System.out.print(isBipartite(graph));
    }
}
