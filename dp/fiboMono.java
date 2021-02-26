import java.util.*;
public class fiboMono{
    static int res;
static int fibo(int[]a,int n)
{
    if(a[n]==-1)
    {
    if(n==1||n==0)
     a[n]=n;
    else
    a[n]= fibo(a,n-1)+fibo(a,n-2);
    
    }
    return a[n];
}


    public static void main(String[] args) {
        int n=6;
        int[]a=new int[n+1];
        Arrays.fill(a,-1);
     fibo(a,n); 
     for(int i:a)System.out.print(i+" "); 
    }
}