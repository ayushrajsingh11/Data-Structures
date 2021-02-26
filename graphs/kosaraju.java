import java.util.*;
public class kosaraju {
    static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v)
    {
        a.get(u).add(v);
       // a.get(v).add(u);
    } 
    static void dfs(ArrayList<ArrayList<Integer>>a,int v,int s)
    {boolean[] visited=new boolean[v+1];
       // visited[s]=true;
         Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<v;i++)
        {
            if(visited[i]==false)
            {
                dfsRec(a,i,st,visited);
            }
        }
       reverse(a,v,st);
        for(int i=0;i<v;i++)
        {
            visited[i]=false;
        }
        while(st.isEmpty()==false)
        {
           int x=st.pop();
           if(visited[x]==false)
           {
               dfsUntil(a,x,visited);

           }
            
        }
       
    }
   static void dfsUntil(ArrayList<ArrayList<Integer>>a,int v,boolean visited[]) 
    { 
        // Mark the current node as visited and print it 
        visited[v] = true; 
        System.out.print(v + " "); 
  
        int n; 
  
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> i =a.get(v).iterator(); 
        while (i.hasNext()) 
        { 
            n = i.next(); 
            if (!visited[n]) 
            {
                dfsUntil(a,n,visited); 
                System.out.println();
            }
        } 
    }
    static void reverse(ArrayList<ArrayList<Integer>>a,int v,Stack st)
    {
        for(int i = 0; i < v; i++) {
       for(int j:a.get(i)){

           addEdge(a,j, i);
           
       }
      
        }
        
    }
    static void  dfsRec(ArrayList<ArrayList<Integer>>a,int v,Stack st,boolean[]visited)
    {
        visited[v]=true;
       
                 for(int x:a.get(v))//Source
                 {
                       if(visited[x]==false)
                       
                       dfsRec(a,x,st,visited);
                 }
                 st.push(v);
             
    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> a=new ArrayList<>(6);
        for(int i=0;i<v;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        addEdge(a,1, 0);
        addEdge(a,0, 2);
        addEdge(a,2, 1);
        addEdge(a,0, 3); 
        addEdge(a,3, 4);
        dfs(a,v,0);
    }
}
