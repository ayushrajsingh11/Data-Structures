package searching;
import java.util.*;
//import java.io.*;
public class occuOfFirstBinary {
    public static int f(int[] a,int n,int t)
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
             /*  if(mid==0||a[mid-1]!=a[mid])
               {
                   return mid;
               }
               else
               high=mid-1;
           }*/    //this is first occurance
           if(mid==0||a[mid+1]!=a[mid])
           return mid;
           else
           low=mid+1;
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        int[] a=new int[]{5,20,20,30};
         int n=a.length;
         Scanner f=new Scanner(System.in);
         int t=f.nextInt();
         System.out.println(f(a,n,t)); 
         f.close();
    }
}