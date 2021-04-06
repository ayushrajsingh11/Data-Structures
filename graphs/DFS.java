/*package whatever //do not write package name here */
import java.util.*;

class Graph {
  private LinkedList<Integer> adjLists[];
  private boolean visited[];

  // Graph creation
  Graph(int vertices) {
    adjLists = new LinkedList[vertices];
    visited = new boolean[vertices];

    for (int i = 0; i < vertices; i++)
      adjLists[i] = new LinkedList<Integer>();
  }

  // Add edges
  void addEdge(int src, int dest) {
    adjLists[src].add(dest);
  }

  // DFS algorithm
  void DFS(int vertex) {
    visited[vertex] = true;
    System.out.print(vertex + " ");

    Iterator<Integer> ite = adjLists[vertex].listIterator();
    while (ite.hasNext()) {
      int adj = ite.next();
      if (!visited[adj])
        DFS(adj);
    }
  }

  public static void main(String args[]) {
    Graph g = new Graph(4);

     g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println(
            "Following is Depth First Traversal "
            + "(starting from vertex 2)");
 
        g.DFS(2);
  }
}
/*import java.util.*;
public class DFS {
    static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v)
    {
        a.get(u).add(v);
       // a.get(v).add(u);
    }
    static void dfs(ArrayList<ArrayList<Integer>> a,int v,int s)
    {
        boolean[] visited=new boolean[v+1];
       dfss(a,s,visited);
    }
    static void dfss(ArrayList<ArrayList<Integer>> a,int s,boolean[] visited)
    {
        visited[s]=true;
        System.out.print(s+" ");
        for(int i:a.get(s))
        {
            if(visited[i]==false)
            {
               dfss(a,i,visited);

            }
        }
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<ArrayList<Integer>> a=new ArrayList<>(6);
        for(int i=0;i<v;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        addEdge(a,0,1);
        addEdge(a,0,2);
        addEdge(a,1,0);
        addEdge(a,1,3);
        addEdge(a,1,4);
        addEdge(a,2,0);
        addEdge(a,2,3);
        addEdge(a,3,2);
        addEdge(a,3,1);
        addEdge(a,4,1);
        addEdge(a,4,5);
        addEdge(a,5,4);
          

        dfs(a,v,0);    }
}*/
