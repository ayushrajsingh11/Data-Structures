//import java.util.*;
//import java.io.*;
//import java.lang.*;
public class setBit {
    public static void main(String[] args)throws java.lang.Exception{
        
    
        char []set = {'a', 'b', 'c'}; 
    long n=(long)Math.pow(2,3);
    int count=1<<n;
    for(int i=0;i<count;i++)
    {
        for(int j=0;j<n;j++)
        {
          if((i&(1<<j))>0)
          {
              System.out.println(set[j]);
          }  
          System.out.println();
        }
    }
    }
}