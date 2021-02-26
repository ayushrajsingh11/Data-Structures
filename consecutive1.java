import java.util.*;
//import java.lang.*;
//import java.io.*;
public class consecutive1 {
    public static void main(String[] args) {
      Scanner f=new Scanner(System.in);
      int i,j;
      int n=f.nextInt();
       int[] a=new int[n];
       for(i=0;i<n;i++)
       {
        a[i]=f.nextInt();
       }
      int r=0;
       
        int c=0;
           for(j=0;j<n;j++)
           {
               if(a[j]==0) 
               {
                   c=0;
               }
               
               else
               {
                   c++;
                   r=Math.max(c,r);
               }
            
           } 
           
        
        System.out.println(r);
        f.close();
    }
}