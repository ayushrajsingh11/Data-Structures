import java.util.*;
public class shortestPathUnweighted {
    static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v)
    {
        a.get(u).add(v);
      //  a.get(v).add(u);
    }
    static void shortest(ArrayList<ArrayList<Integer>>a,int s,int v)
    {
       int[] dist=new int[v];
       dist[s]=0;
       Queue<Integer> q=new LinkedList<>();
       q.add(s);
       boolean[] visited=new boolean[v+1];
       visited[s]=true;
       while(q.isEmpty()==false)
       {
           int cur=q.poll();
           //System.out.print(cur+" ");
           for(int i:a.get(cur))
           {
              if(visited[i]==false)
              {
                  dist[i]=dist[cur]+1;
                  visited[i]=true;
                  q.add(i);
              }
           }
       }
       for(int i:dist)
       {
           System.out.print(i+" ");
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
        addEdge(a,0,4);
        addEdge(a,2,0);
        addEdge(a,2,3);
        addEdge(a,2,4);
        addEdge(a,3,1);
        addEdge(a,3,2);
        addEdge(a,3,5);
        addEdge(a,4,0);
        addEdge(a,4,2);
        addEdge(a,4,5);
        addEdge(a,5,3);
        addEdge(a,5,4);
        shortest(a,0,v);
          
    }
}
