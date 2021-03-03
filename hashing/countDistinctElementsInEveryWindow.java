import java.util.*;
import java.io.*;
public class countDistinctElementsInEveryWindow {
    public static void main(String[] args) {
        int[]a=new int[]{10,20,20,10,30,40,10};
        int k=4;
        Map<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<k;i++)
        {
            h.put(a[i],h.getOrDefault(a[i], 0) + 1);
        }
       System.out.println(h.size());
        // for(Map.Entry<Integer,Integer>e:h.entrySet())
        // {
        //     System.out.println(e.getValue()+" "+e.getKey());
        // }
        for(int i=k;i<a.length;i++)
        {
            h.put(a[i - k],  h.get(a[i - k]) - 1);
            
            if (h.get(a[i - k]) == 0) { 
                h.remove(a[i-k]); 
            }   
            h.put(a[i], h.getOrDefault(a[i], 0) + 1);
        
            System.out.print(h.size()+" "); 
        }
       
    }
}
