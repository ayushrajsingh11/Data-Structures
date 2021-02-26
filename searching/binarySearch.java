package searching;
import java.util.*;
//import java.io.*;

public class binarySearch {
    public static int search(int[] a,int n,int t)
    {
      int low=0;
      int high=n-1;
     
       while(low<=high)
       { int mid=low+(high-low)/2;
           if(a[mid]==t)
             return mid;
        
           else if(a[mid]>t)
            high=mid-1;
           
            low=mid+1;  
           
          
       }
       return -1;
      
    }
    public static void main(String[] args) throws java.lang.Exception {
        Scanner f=new Scanner(System.in);
        int n=f.nextInt();
        int[] a=new int[n];
        int t=f.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=f.nextInt();
        }
       Arrays.sort(a);
        int m=a.length;
        System.out.println(search(a, m, t));
        f.close();
    }
    
}