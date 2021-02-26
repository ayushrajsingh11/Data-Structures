public class SlidingWindowTech {
    public static void main(String[] args) {
        int[] a=new int[]{1,8,30,-5,20,7};
        int n=a.length;
        int i,k=3,s=0;
       /* for(i=0;i+k-1<n;i++)
        {int s=0;
            for(j=0;j<k;j++)
            {
              s+=a[i+j];
            }
            rM=Math.max(s,rM);
        }
        */
        
        
        //alternate approach in O(n)
        for(i=0;i<k;i++)
        {
            s+=a[i];
        }
        int MaxS=s;
        for(i=k;i<n;i++)
        {
            s+=a[i]-a[i-k];
            MaxS=Math.max(MaxS,s);
        }
        System.out.println(MaxS);
    }
}