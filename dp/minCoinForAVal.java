import java.util.*;
public class minCoinForAVal{
    static int coins(int[]a,int n,int v)
    {
        if(v==0)return 0;
        int r=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=v)
            {
                 int Xr=coins(a,n,v-a[i]);
                if(Xr!=Integer.MAX_VALUE)
               r=Math.min(r,Xr+1);
            }
        }
        return r;
    }
    public static void main(String[] args) {
        int[]a=new int[]{25,10,5};
        System.out.print(coins(a,a.length,30));
    }

}