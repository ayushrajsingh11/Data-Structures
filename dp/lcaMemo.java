import java.util.*;
public class lcaMemo {
    static int[][]memo=new int[6][6];
    static int lca(String s1,String s2,int m,int n)
    {
        if(memo[m][n]!=-1)
        return memo[m][n];
        if(m==0||n==0)
        memo[m][n]=0;
        else 
        {
              if(s1.charAt(m-1)==s2.charAt(n-1))
              memo[m][n]=1+lca(s1,s2,m-1,n-1);
              else 
              {
                  memo[m][n]=Math.max(lca(s1,s2,m-1,n),lca(s1,s2,m,n-1));

              }

        }
        return memo[m][n];
    }
    public static void main(String[] args) {
        for(int i=0;i<memo.length;i++)
        {
            for(int j=0;j<memo.length;j++)
            memo[i][j]=-1;
        }
        ;String s1="axyz";String s2="baz";
        System.out.print(lca(s1,s2,s1.length(),s2.length()));
    }

}
