import java.util.*;
public class maxCuts{
    static int cut(int n,int a,int b,int c)
    {
        
        if(n<0)return -1;
        if(n==0)return 0;
    int r=Math.max(cut(n-a,a,b,c),Math.max(cut(n-b,a,b,c),cut(n-c,a,b,c)));
   
            if(r<0)
            return r;
            else
            return r+1;
            
       
    }
    public static void main(String[] args) {
        int n=5;
        int a=1,b=2,c=3;
        System.out.print(cut(n,a,b,c));
    }
}