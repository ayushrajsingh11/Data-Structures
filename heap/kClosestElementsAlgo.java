import java.util.*;
import java.io.*;
public class kClosestElementsAlgo {
    public static void main(String[] args) {
        int[] a=new int[]{30,40,32,33,36,37};
        PriorityQueue<Integer> q=new PriorityQueue<Integer>();
         int k=3;
         int x=38;int am=0;
         for(int i=0;i<k;i++)
         { am=Math.abs(x-a[i]);
             q.add(am);
         }
         for(int i=k;i<a.length;i++)
         {
             if(q.peek()>am){
             q.remove();
              q.add(am);
             }
         }
         for(Integer i: q)System.out.print(" "+i);
    }
}
