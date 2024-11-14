import java.util.ArrayList;

public class Creating_graphs {
    public static class Edge {
       int src;
       int dist;
       int wt;
       public Edge(int s,int d,int w){
        this.src=s;
        this.dist=d;
        this.wt=w;
       }
       
    }
    public static void main(String[] args) {
        int v=5; // vertex
        ArrayList<Edge>[] graph = new ArrayList[v]; /// now the array is null i.e undefined ,so we need to define Arraylist inside array Graph
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>(); //now it will store empty ArrayList in each index 
        }

        //vertex zero
       graph[0].add(new Edge(0,1,5));

       // vertex : 1
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        // vertex : 2
        graph[2].add(new Edge(2,4,2));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,1,1));
        // vertex : 3
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        // vertex : 4
        graph[4].add(new Edge(4,2,2));

        //2's Neighbours 
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dist);
        }
    }
}
