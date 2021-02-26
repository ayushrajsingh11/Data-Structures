import java.util.*;
public class detectCycleUsingBFS {
    static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v)
    {
        a.get(u).add(v);
       // a.get(v).add(u);
    } 
    static boolean bfs(ArrayList<ArrayList<Integer>>a,int v)
    {
       int[] in=new int[v];
       for(int i=0;i<v;i++)
       {
           for(int j:a.get(i))
           {
               in[j]++;
           }
       }
      Queue<Integer> q=new LinkedList<>();
      int c=0;
      for(int i=0;i<in.length;i++)
      {
         if(in[i]==0)
         q.add(i);
      }
      while(q.isEmpty()==false)
      {
          int cur=q.poll();
          for(int i:a.get(cur))
          {
              in[i]--;
              if(in[i]==0)
              q.add(i);
              
          }
          c++;

      }
      if(v!=c)
      return true;
      return false;
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> a=new ArrayList<>(5);
        for(int i=0;i<v;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        addEdge(a,0, 1); 
        addEdge(a,2,0); 
        addEdge(a,1, 2); 
    addEdge(a,2, 3);
    //addEdge(a,1,4); 
    System.out.print(bfs(a,v) );
    }
}
