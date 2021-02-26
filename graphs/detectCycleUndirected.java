import java.util.*;


public class detectCycleUndirected {

    static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v)
    {
        a.get(u).add(v);
        a.get(v).add(u);
    } 
    static boolean dfsRec(ArrayList<ArrayList<Integer>> a,int s,boolean[] visited,int parent){
        visited[s]=true;
        for(int i:a.get(s))
        {
          if(visited[i]==false)
          if(dfsRec(a,i,visited,s)==true)
          return true;
          else if(i!=parent)
          return true;

        }
        return false;
    }  
    static boolean dfsCycle(ArrayList<ArrayList<Integer>> a,int v)
    {
        boolean[] visited=new boolean[v+1];
        for(int i=0;i<v;i++){
            if(visited[i]==false)
                if(dfsRec(a,i,visited,-1)==true)
                   return true;
        }
                   
        return false;           
            
        

    }
     public static void main(String[] args) {
        int v=6;
        ArrayList<ArrayList<Integer>> a=new ArrayList<>(6);
        for(int i=0;i<v;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        addEdge(a,0,1);
        addEdge(a,1,2);
        addEdge(a,1,3);
        addEdge(a,2,1);
        addEdge(a,2,3);
       addEdge(a,3,1);
        addEdge(a,3,2);
        System.out.print(dfsCycle(a,v));
    }
}
