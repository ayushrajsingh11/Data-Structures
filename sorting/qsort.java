package sorting;
//import java.util.*;

public class qsort {
    public static void qsort(int[] a,int l,int h)
    {
        if(l<h)
        {
            int p=lumoto(a,l,h);
            qsort(a,l,p-1);
            qsort(a,p+1,h);

        }
    }
public static int lumoto(int[] a,int l,int h)
{
int i=l-1;
int j;
int piv=a[h];

    for(j=l;j<h-1;j++)
    {
        if(piv>=a[j])
        {
            i++;
            int t=a[j];
            a[j]=a[i];
            a[i]=t;
            
        }

    }
    int y=a[i+1];
    a[i+1]=a[h];
    a[h]=y;

  //  swap(a[i+1],a[h]);
    return (i+1);


}
public static void print(int[] a)
{
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+" ");
    }
    //System.out.println();
}

       public static void main(String[] args) {
           int[] a=new int[]{8,4,3,7,9,10,5};
           int l=0;
           int h=a.length;
           qsort(a,l,h-1);
           print(a);
       }    
}