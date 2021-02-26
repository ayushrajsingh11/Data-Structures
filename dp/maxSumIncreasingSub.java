import java.util.*;
public class maxSumIncreasingSub{
    static int max(int[]a,int n)
     {int ans=0;
        int[]m=new int[n];
        for(int i=0;i<n;i++)
        {
            m[i]=a[i];
            for(int j=0;j<i;j++)
            {
               if(a[i]>m[j])
               m[i]=Math.max(m[i],a[i]+m[j]);
            }
        }
        Arrays.sort(m);
        return m[m.length-1];
     }
    public static void main(String[] args) {
    int[]a=new int[]{3,20,4,6,7,30};
    System.out.print(max(a,a.length));
}
}