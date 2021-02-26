import java.util.*;
public class detechCycleDirected {
  
        static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v)
        {
            a.get(u).add(v);
           // a.get(v).add(u);
        } 
        static boolean dfsCy(ArrayList<ArrayList<Integer>>a,int v)
        {
              boolean[] visited=new boolean[v];
              boolean[] stack=new boolean[v];
              for(int i=0;i<v;i++)
                  if(visited[i]==false)
                   if(recur(a,i,visited,stack))
                        return true;
              
              return false;
        }
        static boolean recur(ArrayList<ArrayList<Integer>>a,int s,boolean[]visited,boolean[] stack)
        {
            visited[s]=true;
            stack[s]=true;
            for(int i:a.get(s))
                if(visited[i]==false)//ek teer se 2 nishane
                    visited[i]=true; 
                else if(stack[i]==true)
                return true;
            
            stack[s]=false;
            return false;
        }
    public static void main(String[] args) {
        int v=6;
        ArrayList<ArrayList<Integer>> a=new ArrayList<>(6);
        for(int i=0;i<v;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        addEdge(a,0, 1); 
		addEdge(a,0, 2); 
	addEdge(a,1, 2); 
		//addEdge(a,2, 0); 
	addEdge(a,2, 3); 
	//	addEdge(a,3, 3);
        addEdge(a,5,3);
        System.out.print(dfsCy(a,v));
    }
}
