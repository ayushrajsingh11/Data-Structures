//import java.util.*;
public class AlternateEvenOdd {
    public static void main(String[] args) {
        int[] a=new int[]{10,12,14,7,8};
        int i,r=1,c=1;
        for( i=1;i<a.length;i++)
        {
           
                if((a[i]%2==0&&a[i-1]%2!=0)||(a[i]%2!=0&&a[i-1]%2==0))
                {
                    c++;
                    r=Math.max(c,r);
                }
                else
                {
                  c=1;
                }
          
            
        }
        System.out.println(r);
    }
}
//O(N)