import java.util.*;
public class bridges {
    static int time=0;
    static int NIL=-1;
    static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v)
    {
        a.get(u).add(v);
       a.get(v).add(u);
    }
    static void dfs(ArrayList<ArrayList<Integer>>a,int v)
    {
        boolean[]vis=new boolean[v];int[]parent=new int[v];int[]low=new int[v];int[]dis=new int[v];
       for(int i=0;i<v;i++)
       {
           parent[i]=NIL;
       }
        for(int i=0;i<v;i++)
        {if(vis[i]==false)
           
            
            Bridges(a,i,vis,parent,low,dis);
        }
    }
    static void Bridges(ArrayList<ArrayList<Integer>>a,int s,boolean[] vis,int[]parent,int[] low,int[] dis)
    {
        vis[s]=true;
      low[s]=dis[s]=++time;
        for(int i:a.get(s))
        {
            if(vis[i]==false)
            {
                parent[i]=s;

                Bridges(a,i,vis,parent,low,dis);
                low[s]=Math.min(low[i],low[s]);

                if(low[i]>dis[s])
                System.out.print(i+" "+ s);
                else if (i != parent[s]) 
                low[s]  = Math.min(low[s], dis[i]); 



               
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
        addEdge(a,0, 1);
        addEdge(a,0, 2);
        addEdge(a,1, 2);
        addEdge(a,1, 0); 
        addEdge(a,1, 3); 
        addEdge(a,2, 1);
        addEdge(a,2, 0);
        addEdge(a,3, 1);
        addEdge(a,3, 4);
        addEdge(a,4, 3);
        dfs(a,v);
    }
}
