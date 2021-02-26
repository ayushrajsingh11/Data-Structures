import java.util.*;
public class articulation {
    static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v)
    {
        a.get(u).add(v);
        a.get(v).add(u);
    } 
    static void dfs(ArrayList<ArrayList<Integer>>a,int v)
    {
       boolean[]vistied=new boolean[v];
      int count=0;
      int[]parent=new int[v];
      int[]disc=new int[v];
      int[]low=new int[v];
boolean[]ap=new boolean[v];

          for(int i=0;i<v;i++)
          {if(vistied[i]==false)
            dfsRec(a,i,vistied,disc,low,parent,ap);
          }
          for(int i=0;i<v;i++)
          {
           if(ap[i]==true)
           System.out.print(i);
          }

           
    }
    static void dfsRec(ArrayList<ArrayList<Integer>>a,int u,boolean[]vistied,int[]disc,int[]low,int[]parent,boolean[]ap)
    {
        
        vistied[u]=true;
        int children=0;

          for(int i:a.get(u))       
         {
             if(vistied[i]==false)
             {
                 children++;
                 parent[i]=u;
             dfsRec(a,i,vistied,disc,low,parent,ap);

             low[u]=Math.min(low[u],low[i]);

             if(parent[u]!=0&&low[i]>=disc[u])
             ap[u]=true;
             }
             else if(i!=parent[u])
             low[u]=Math.min(low[u],disc[i]);
         } 
        
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> a=new ArrayList<>(5);
        for(int i=0;i<v;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        addEdge(a,0, 1);
        addEdge(a,0, 2);
        addEdge(a,1, 2);
        addEdge(a,1, 0); 
        addEdge(a,2, 3);
        addEdge(a,3, 2);
        addEdge(a,3, 4);
        addEdge(a,4, 3);
        dfs(a,v);
    }
}
