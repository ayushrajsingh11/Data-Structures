import java.util.*;
public class MAxSumWithNoTwoConsecutive {
    static int noConsecutive(int[] a,int n)
    {
        int[]dp=new int[n+1];
        dp[1]=a[0];
        int r=0;
        dp[2]=Math.max(a[0],a[1]);
        for(int i=3;i<=n;i++)
        {
         dp[i]=Math.max(dp[i-1],dp[i-2]+a[i-1]);
        }
       // for(int i:dp)System.out.println(i);
        return dp[n];
    }
    public static void main(String[] args) {
        int[]a=new int[]{10,5,15,20};
        System.out.print(noConsecutive(a, a.length));
    }
}
