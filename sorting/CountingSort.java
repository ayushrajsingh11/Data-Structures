package sorting;

public class CountingSort {
    public static void main(String[] args) 
    {
    int[] a=new int[]{1,4,4,1,0,1};
    int k=5;
    int n=a.length;
    int[] count=new int[k];
    for(int i=0;i<k;i++)
    count[i]=0;
    
    for(int i=0;i<n;i++)
    {
        count[a[i]]++;
    }
    int index=0;
    for(int i=0;i<k;i++)
    {
      for(int j = 0; j < count[i]; j++)// maintainig two d/f arrays
      {
       a[index]=i;
       index++;
      }
    }
    for(int i=0;i<n;i++)
    {
     System.out.print(a[i]+" ");   
    }
}
}