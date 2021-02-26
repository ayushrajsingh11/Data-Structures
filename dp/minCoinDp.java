import java.util.*;
public class minCoinDp {
    static int coins(int[]a,int n,int v)
    {
        int[]dp=new int[v+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=v;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[j]<=i)
                {
                    int sub=dp[i-a[j]];
                    if(sub!=Integer.MIN_VALUE)
                    dp[i]=Math.min(dp[i],sub+1);
                }
            }
        }
        return dp[v];


    }
    public static void main(String[] args) {
        int[]a=new int[]{25,10,5};
        System.out.print(coins(a,a.length,30));
    }
}
