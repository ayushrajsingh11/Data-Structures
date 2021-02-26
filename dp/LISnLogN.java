import java.util.*;
public class LISnLogN{
    static int lis(int[]a,int n)
    {
        int tail[]=new int[n];
        tail[0]=a[0];
        int l=1;
        for(int i=1;i<n;i++)
        {
            if(a[i]>tail[l-1])
            {
            tail[l]=a[i];
            l++;
            }
            else
            {
                 int c=ceil(tail,0,l-1,a[i]);
                 tail[c]=a[i];
            }
        }


        return l;
    }
    static int ceil(int[]tail,int l,int r,int x)
    {
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(tail[mid]>=x)
            r=mid;
            else
            l=mid+1;

        }
        return r;
    }

 public static void main(String[] args) {
     int[]a=new int[]{8,100,150,10,12,14,110};
     System.out.print(lis(a,a.length));
 }
}