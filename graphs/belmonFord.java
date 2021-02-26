import java.util.*;
public class belmonFord {
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
    static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v,int weight)
    {
       
       // a.get(v).add(u);
     //  AdjListNode node = new AdjListNode(v,weight); 
       a.get(u).add(v,weight);
    } 
    static void belmenn(ArrayList<ArrayList<Integer>>a,int v)
    {
        int[]dist=new int[v];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;AdjListNode node;
        for(int count=0;count<v-1;count++)
        { 
          for(int x:a.get(count))
          {
            //  if(dist[x]>dist[count]+node.getWeight());
          }  
        }
    }
    public static void main(String[] args) {
       //
       // dfs(a,v,0);
    }
    
}
