package sorting;
//import java.util.*;
//import java.io.*;
public class Radix {
    public static void radix(int[] a,int n)
    {
        int max=-1;
        for(int u=0;u<n;u++)
        {
            if(a[u]>max)
            max=a[u];
        }
        int pos;
        for(pos=1;max/pos>0;pos*=10)
        {
          countS(a,n,pos);
        }
    }
    public static void countS(int[] a,int n,int pos)
    {
        int[] count=new int[10];
        int cn=count.length;
        int[] opt=new int[n];
        for(int i=0;i<cn;i++)
        {
            count[i]=0;//setting all the values to 0
        }
        for(int i=0;i<n;i++)
        count[(a[i]/pos)%10]++;//used POS here bcoz, when the second pass will come we need the second element
        for(int i=1;i<cn;i++)
        count[i]+=count[i-1];//just added the elements to the count
        for(int i=n-1;i>=0;i--)
        opt[--count[(a[i]/pos)%10]]=a[i];//consept same!,values setted to the opt array
        for(int i=0;i<n;i++)
        a[i]=opt[i];//values copied just!!!!!!

    }
    public static void print(int[] a,int n)
    {
    for(int i=0;i<n;i++)
    System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        int[] a=new int[]{432,8,530,88,11,45,677,199};

         int n=a.length;
         radix(a,n);
       print(a,n);
    }
}