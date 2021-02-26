import java.util.*;
public class shortestPathDAG {
    static final int INF=Integer.MAX_VALUE; 
    class AdjListNode 
    { 
        private int v; 
        private int weight; 
        AdjListNode(int _v, int _w)
         { 
             v = _v;  
        weight = _w; 
        } 
        int getV() 
        { 
            return v; 
        } 
        int getWeight()  
        { return weight; 
        } 
    } 
   class Graph{
    private int V; 
    private ArrayList<AdjListNode>adj[]; 
    Graph(int v) 
    { 
        V=v; 
        adj = new ArrayList[V]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new ArrayList<AdjListNode>(); 
    } 
    void addEdge(int u, int v, int weight) 
    { 
        AdjListNode node = new AdjListNode(v,weight); 
        adj[u].add(node);// Add v to u's list 
    } 
      // See below link for details 
      void topologicalSortUtil(int v, Boolean visited[], Stack stack) 
      { 
          // Mark the current node as visited. 
          visited[v] = true; 
          Integer i; 

          // Recur for all the vertices adjacent to this vertex 
          Iterator<AdjListNode> it = adj[v].iterator(); 
          while (it.hasNext()) 
          { 
              AdjListNode node =it.next(); 
              if (!visited[node.getV()]) 
                  topologicalSortUtil(node.getV(), visited, stack); 
          } 
          // Push current vertex to stack which stores result 
          stack.push(new Integer(v)); 
      } 
   void sortest(int s)
  { 
       Stack stack = new Stack(); 
       int dist[] = new int[V]; 

       // Mark all the vertices as not visited 
       Boolean visited[] = new Boolean[V]; 
       for (int i = 0; i < V; i++) 
           visited[i] = false; 

       // Call the recursive helper function to store Topological 
       // Sort starting from all vertices one by one 
       for (int i = 0; i < V; i++) 
           if (visited[i] == false) 
               topologicalSortUtil(i, visited, stack); 

       // Initialize distances to all vertices as infinite and 
       // distance to source as 0 
       for (int i = 0; i < V; i++) 
           dist[i] = INF; 
       dist[s] = 0; 

       // Process vertices in topological order 
       while (stack.empty() == false) 
       { 
           // Get the next vertex from topological order 
           int u = (int)stack.pop(); 

           // Update distances of all adjacent vertices 
           Iterator<AdjListNode> it; 
           if (dist[u] != INF) 
           { 
               it = adj[u].iterator(); 
               while (it.hasNext()) 
               { 
                   AdjListNode i= it.next(); 
                   if (dist[i.getV()] > dist[u] + i.getWeight()) 
                       dist[i.getV()] = dist[u] + i.getWeight(); 
               } 
           }
        }
        for (int i = 0; i < V; i++) 
            { 
                if (dist[i] == INF) 
                    System.out.print( "INF "); 
                else
                    System.out.print( dist[i] + " "); 
            } 
        } 
     
       } 
    Graph newGraph(int number) 
    { 
        return new Graph(number); 
    } 
  
    public static void main(String[] args) {
        shortestPathDAG t = new shortestPathDAG(); 
        Graph g = t.newGraph(6); 
        g.addEdge(0, 1, 2); 
        g.addEdge(0, 4, 1); 
        g.addEdge(1, 2, 3); 
        g.addEdge(4, 2, 2); 
        g.addEdge(4, 5, 4); 
        g.addEdge(2, 5, 2); 
        g.addEdge(2, 3, 6); 
        g.addEdge(5, 3, 1); 
        //g.addEdge(4, 5, -2); 
   g.sortest(0);
//addEdge(a,1,4); 
}
}