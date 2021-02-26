import java.util.*;
public class ratMaze {
    static int n=3;
   static int[][]maze=new int[][]{
        {1,0,0},
        {1,0,0},
        {1,1,1}
    };
  static  int[][]sol=new int[3][3];
   static boolean safe(int i,int j){
       return (i>=0&&j>=0&&i>n&&j>n&&maze[i][j]==1);
   }
   static boolean solve()
   {
       if(rec(0,0)==false)
       return false;
       else{
           for(int k=0;k<sol.length;k++)
           {
               System.out.print(sol[k]+" ");
               
            }
return true;
       }
   }
   static boolean rec(int i,int j)
   {
    if(i==n-1&&j==n-1)
    {sol[i][j]=1;
    return true;
    }
    if(safe(i,j)==true)
    {
        sol[i][j]=1;
        if(rec(i+1,j)==true)
        return true;
        if(rec(i,j+1)==true)
        return true;
    }
    sol[i][j]=0;
    return false;
   }
public static void main(String[] args) {
    
    System.out.println(solve());

}
}
