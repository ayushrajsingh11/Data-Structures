import java.util.*;
//import java.io.*;
//import java.lang.*;
public class RainWater {
    public static void main(String[] args)  {
        Scanner f=new Scanner(System.in);
        
        int i,j;
        int[] a=new int[]{3,0,1,2,5};
    int n=a.length;
    int r=0;
    int[] lmax=new int[n];
    int[] rmax=new int[n];
    lmax[0]=a[0];
    for(i=1;i<n;i++)
    {
        lmax[i]=Math.max(lmax[i-1],a[i]);
       

    }
    rmax[n-1]=a[n-1];
    for(j=n-2;j>=0;j--)
    {
        rmax[j]=Math.max(rmax[j+1],a[j]);

    }
    for(int y=0;y<n;y++)
    {
        r+=Math.min(lmax[y],rmax[y])-a[y];
    }
    System.out.println(r);
f.close();
}
}