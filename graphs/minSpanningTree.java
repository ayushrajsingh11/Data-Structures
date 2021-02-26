import java.util.*;

import java.util.*;
public class minSpanningTree {
    static void prims(int[][] graph)
    {
      int v=4;
      boolean[] minset=new boolean[v];
      int[] key=new int[v];
      Arrays.fill(key,Integer.MAX_VALUE);
      int r=0;
      for(int count=0;count<v;count++)
      {
          int u=-1;
          for(int i=0;i<v;i++)//FOR FINDING MINIMUM
            if(!minset[i]&&u==-1||key[i]<key[u])
                u=i;
           minset[u]=true;
           r=r+key[u];
           for(int j=0;j<v;j++)//FOR CHECKING ADJACENT
               if(!minset[j]&&graph[u][j]!=0&&graph[u][j]<key[j])
                  key[j]=graph[u][j];
                  
                
      }
 System.out.print(r);
    }
    public static void main(String[] args) {
        int[][] graph=new int[][] { { 0, 5, 8, 0 },
        { 5, 0, 10, 15 },
        { 8, 10, 0, 20 },
        { 0, 15, 20, 0 } };;
        prims(graph);
      //  Scanner f=new Scanner(System.in);
    }
}
