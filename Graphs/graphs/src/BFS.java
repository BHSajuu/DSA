import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    
  public static class Edge{
    int src;
    int dist;
    int wt;
    public Edge(int s,int d,int w){
     this.src=s;
     this.dist=d;
     this.wt=w;
    }
  }
 
  public static void createGraph(ArrayList<Edge>[] graph){
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>(); 
    }
    graph[0].add(new Edge(0,1,1));
    graph[0].add(new Edge(0,2,1));

    graph[1].add(new Edge(1,0,1));
    graph[1].add(new Edge(1,3,1));

    graph[2].add(new Edge(2,0,1));
    graph[2].add(new Edge(2,4,1));

    graph[3].add(new Edge(3,1,1));
    graph[3].add(new Edge(3,5,1));

    graph[4].add(new Edge(4,2,1));
    graph[4].add(new Edge(4,5,1));

    graph[5].add(new Edge(5,3,1));
    graph[5].add(new Edge(5,4,1));
    graph[5].add(new Edge(0,1,1));

    graph[6].add(new Edge(6,5,1));
  }

  public static void bfs(ArrayList<Edge>[] graph){
    Queue<Integer> q = new LinkedList<>();
    boolean visit[] = new boolean[graph.length];
     q.add(0);
     while (!q.isEmpty()) {
         int curr = q.remove();
         if(!visit[curr]){
            System.out.print(curr +" ");
            visit[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                q.add(graph[curr].get(i).dist);
            }
         }
     }

  }
  public static void main(String[] args) {
    int v=7; // vertex
    ArrayList<Edge>[] graph = new ArrayList[v];
    createGraph(graph);
    bfs(graph);
  }

}
