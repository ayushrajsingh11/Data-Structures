public class bnoacchi {
    public static void main(String[] args) {
        int m=8,n=3;
        int[] a=new int[m];
        int i,j,k;
       a[n-1]=1;

        for(i=n;i<m;i++)
        {
            for(j=i-n;j<i;j++)
            a[i]+=a[j];
        }
        for(i=0;i<m;i++)
        System.out.print(" "+a[i]);
    }
}