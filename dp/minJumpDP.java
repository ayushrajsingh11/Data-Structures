import java.util.*;
public class minJumpDP {
    static int MinJumps(int[]a,int n)
    {
       int[]dp=new int[n];
         Arrays.fill(dp,Integer.MAX_VALUE);
         dp[0]=0;
         for(int i=1;i<n;i++)
         {
             for(int j=0;j<i;j++)
             {
                 if(j+a[j]>=i)
                 {
                     if(dp[j]!=Integer.MAX_VALUE)
                   dp[i]=Math.min(dp[i],dp[j]+1);
                 }
             }
         }
         return dp[n-1];
    }

    public static void main(String[] args) {
        int[]a=new int[]{3,4,1,2,1,2};
        System.out.println(MinJumps(a,a.length));
    }
}
