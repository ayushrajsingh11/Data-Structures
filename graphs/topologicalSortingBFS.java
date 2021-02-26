import java.util.*;
public class topologicalSortingBFS{
    static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v)
    {
        a.get(u).add(v);
       // a.get(v).add(u);
    } 
    static void bfs(ArrayList<ArrayList<Integer>>a,int v)
    {
        boolean visited[]=new boolean[v+1];
        Queue<Integer> q=new LinkedList<>();
        int[] indegree=new int[v];
       for(int i=0;i<v;i++)
       {
      
      
           for(int j:a.get(i))
           indegree[j]++;
         
       }
      
    
      // Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<indegree.length;i++)
       {
           if(indegree[i]==0)
           q.add(i);
       }
      while(q.isEmpty()==false)
      {
          int cur=q.poll();
          System.out.print(cur+" ");
          for(int i:a.get(cur))
          {
              indegree[i]--;
              if(indegree[i]==0)
              {
                  q.add(i);
              }
          }
      }
       
       
       
       
        
    }
   
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> a=new ArrayList<>(5);
        for(int i=0;i<v;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        addEdge(a,0, 2); 
        addEdge(a,0, 3); 
        addEdge(a,2, 3); 
    addEdge(a,1, 3);
    addEdge(a,1,4); 
    bfs(a,v) ;
    }
}