package sorting;

public class mergeSort {
    public static void MergeSort(int[]a,int l,int h)
    {
        if(l<h)
        {
         int mid=(l+h)/2;
         MergeSort(a,l,mid);
         MergeSort(a,mid+1,h);
         Merge(a,l,mid,h); 
        }
      
    }
    public static void Merge(int[] a,int l,int mid,int h)
    {
        int n1=mid-l+1;
        int n2=h-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++)
        {
            left[i]=a[l+i];
        }
        for(j=0;j<n2;j++)
        {
   right[j]=a[mid+1+j];
        }
        i=0;
        j=0;
        k=l;
        while(i<n1&&j<n2)
        {
            if(a[i]<=a[j])
            {
                a[k++]=left[i++];
            }
            else
            {
                a[k++]=right[j++];
            }

        }
        while(i<n1)
        {
            a[k++]=left[i++];
        }
        while(j<n2)
        {
            a[k++]=right[j++];
        }
       
       
           
    }
    public static void print(int[] a)
    {
         for(int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
         }
         System.out.println();
    }
    public static void main(String[] args) {
        int[] a=new int[]{50,40,50,20,10};
        int l=0,h=a.length;
        print(a);
        MergeSort(a,l,h-1);
       print(a);

    }
}