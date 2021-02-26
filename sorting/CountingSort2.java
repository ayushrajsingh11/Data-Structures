package sorting;

public class CountingSort2 {
    public static void main(String[] args) {
        int[] a=new int[]{1,4,4,1,0,1};
        int n=a.length;
        int k=5;
        int[] count=new int[k];
      int[] opt=new int[n];
        for(int i=0;i<k;i++)
        count[i]=0;
        for(int i=0;i<k;i++)
        count[a[i]]++;
        for(int i=1;i<=k;i++)
        {
            count[i]=count[i]+count[i-1];
        }
     /*   for(int i=n-1;i>=0;i++)
        {
            opt[--count[a[i]]]=a[i];
        }
       for(int i=0;i<n;i++)
       System.out.print(opt[i]+" ");
      */
    }
}