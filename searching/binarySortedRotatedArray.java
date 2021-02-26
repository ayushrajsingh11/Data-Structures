package searching;
import java.util.*;
public class binarySortedRotatedArray {
    public static int search(int[] a,int n,int t)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
        int mid=low+(high-low)/2;
        if(a[mid]==t)
        return mid;
         if(a[mid]>a[low])
         {
             if(a[low]<=t&&a[mid]>t)
             {                      
                 high=mid-1;           //LEFT HALF SORTED
             }
             else
             low=mid+1;
         }
         else
         {
             if(a[mid]<t&&a[high]>=t)
             {
                 low=mid+1;        //RIGHT HALF SORTED
             }
             else
             high=mid-1;
         }
         
    }
    return -1;
    }
  public static void main(String[] args) {
      int[] a=new int[]{100,200,300,400,20,30,40};
       Scanner f=new Scanner(System.in);
       int t=f.nextInt();
       int n=a.length;
       System.out.println(search(a,n,t));  
       f.close();
    }  
}