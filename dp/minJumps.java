import java.util.*;
public class minJumps {
    static int MinJumps(int[]a,int n)
    {//System.out.print(n+" ");
    if(n==1)return 0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<=n-2;i++)
        {
            if(i+a[i]>=n-1)
            {//System.out.println(i);
                int subRes=MinJumps(a, i+1);
                res=Math.min(res,subRes+1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[]a=new int[]{3,4,2,1,2,1};
        System.out.println(MinJumps(a,a.length));
    }
}
