package sorting;

public class sortArrayWithTwoTypes 
{
public static void main(String[] args) {
    int[] a=new int[]{15,-3,-2,16};
    int n=a.length;
    int i,j,in=0;
    int[] t=new int[n];
    for(i=0;i<n;i++)
    {
        if(a[i]<0)
        {
            t[in]=a[i];
            in++;
        }
    }
   for(j=0;j<n;j++)
    {
        if(a[j]>0)
        {
          t[in]=a[j];
          in++;
          
        }
    }
    
    for(int k=0;k<t.length;k++)
    System.out.println(t[k]);
}

}