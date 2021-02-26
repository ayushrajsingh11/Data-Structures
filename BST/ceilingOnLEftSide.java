import java.util.*;
public class ceilingOnLEftSide {
    public static void main(String[] args) {
       TreeSet<Integer> t=new TreeSet<>();
       System.out.println(-1);
       int[] a=new int[]{2,8,30,15,25,12};
       t.add(a[0]);
       for(int i=1;i<a.length;i++)
       {
           Integer m=t.ceiling(a[i]);
             if(m==null)
             {
                System.out.println(-1);
             }
             else
             {
                 System.out.println(m);
             }
             t.add(a[i]);
       }

      
    }
}