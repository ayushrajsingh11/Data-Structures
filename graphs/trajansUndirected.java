import java.util.*;
public class trajansUndirected {
    static int time=0;
    static int NIL=-1;
    static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v)
    {
        a.get(u).add(v);
      // a.get(v).add(u);
    }
    static void TarjansRec(ArrayList<ArrayList<Integer>>a,int s,int[] low,int[] dis,boolean[] vis,Stack<Integer> st)
    {
        
      low[s]=time;
      dis[s]=time;
      time+=1;
      vis[s]=true;
      st.push(s);
        for(int i:a.get(s))
        {
            if(dis[i]==-1)
            {
             TarjansRec(a,i,low,dis,vis,st); 
             low[s]=Math.min(low[i],low[i]);
            }
            else if(vis[i]==true)
            {
               low[s]=Math.min(low[s],dis[i]);
            }

        }int w=-1;
        if(dis[s]==low[s])
        {
            while(w!=s)
            {
                int pop=st.pop();
                System.out.print(pop);
                vis[w]=false;
            }
            System.out.println();
        }
    }
    static void dfs(ArrayList<ArrayList<Integer>>a,int v)
    { int disc[] = new int[v];  
        int low[] = new int[v];  
        for(int i = 0;i < v; i++) 
        { 
            disc[i] = -1; 
            low[i] = -1; 
        } 
          
        boolean stackMember[] = new boolean[v];  
        Stack<Integer> st = new Stack<Integer>();  
          
        // Call the recursive helper function  
        // to find articulation points  
        // in DFS tree rooted with vertex 'i'  
        for(int i = 0; i < v; i++) 
        { 
            if (disc[i] == -1) 
                TarjansRec(a,i, low, disc, 
                        stackMember, st); 
        } 
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<ArrayList<Integer>> a=new ArrayList<>(7);
        for(int i=0;i<v;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        addEdge(a,0, 1); 
    addEdge(a,1, 2); 
   addEdge(a,2, 0); 
   addEdge(a,1, 3); 
   addEdge(a,1, 4); 
    addEdge(a,1, 6); 
 addEdge(a,3, 5); 
    addEdge(a,4, 5); 
       dfs(a,v);
    }
}
