import java.util.*;

public class dijistra {
static void dijistr(int[][] g)
{int v=g.length;
     int[]dist=new int[v];
     boolean[] vis=new boolean[v];
     Arrays.fill(dist,Integer.MAX_VALUE);
     dist[0]=0;
    
     for(int count=0;count<v-1;count++)
     {
    int u=-1;
            for(int i=0;i<v;i++){
                if(!vis[i]&&(u==-1||dist[i]<dist[u]))
                   u=i;
            }
         vis[u]=true;
         for(int x=0;x<v;x++)
         {
             if(!vis[x]&&g[u][x]!=0)
                 dist[x]=Math.min(dist[x],(dist[u]+g[u][x]));
                 //System.out.print(" "+dist[u]+" "+g[u][x]+" ");

         }          
     }
   for(int i=0;i<v;i++)
     System.out.print(dist[i]+" ");
}
    public static void main(String[] args) {
        int[][] graph=new int[][]{{0,50,100,0},{50,0,30,200},{100,30,0,20},{0,200,20,0}};
        dijistr(graph);

    }
}
