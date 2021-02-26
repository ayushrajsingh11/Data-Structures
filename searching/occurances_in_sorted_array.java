package searching;
import java.util.*;
public class occurances_in_sorted_array {

    public static int last(int[] a,int n,int t)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            
            int mid=(high+low)/2;
           if(a[mid]>t)
           {
               high=mid-1;
           }
           else if(a[mid]<t)
           {
               low=mid+1;
           }
           else
           {
             
           if(mid==0||a[mid+1]!=a[mid])
           return mid;
           else
           low=mid+1;
        }
    }
        return -1;
    }
    public static int occu(int[] a,int n,int x)
    {
       int c=first(a,n,x);
       if(c==-1)
       {
           return 0;
       }
       else{
           return (last(a,n,x)-c+1);
       }
    }
    public static int first(int[] a,int n,int t)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            
            int mid=(high+low)/2;
           if(a[mid]>t)
           {
               high=mid-1;
           }
           else if(a[mid]<t)
           {
               low=mid+1;
           }
           else
           {
              if(mid==0||a[mid-1]!=a[mid])
               {
                   return mid;
               }
               else
               high=mid-1;
           }    //this is first occurance
          
    }
        return -1;
    }
    public static void main(String[] args) {
     int[] a=new int[]{10,10,10,10,10,10,10};
     Scanner f=new Scanner(System.in);
      int t=f.nextInt();
      int n=a.length;
      System.out.println("The count of "+t+" in log(n) is: "+occu(a, n, t));
      f.close();
    }
}