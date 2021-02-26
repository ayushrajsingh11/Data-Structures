import java.util.*;
import java.io.*;
public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> t=new TreeMap<Integer,String>();
        t.put(1, "g");
        t.put(10,"h");
        t.put(2,"a");
        t.put(4,"a");
        t.put(3,"a");

        System.out.println(t);
        for(Map.Entry<Integer,String> s:t.entrySet())
        {
           System.out.println(s.getKey()+" "+s.getValue());
        }
        System.out.println(t.higherKey(10));
        
        // returns the greatest smaller key 
        // than the passed key i.e., 5
        System.out.println(t.lowerKey(10));
        
        // greatest key <= passed key i.e., 10
        System.out.println(t.floorKey(10));
        
        // greatest key >= passed key i.e., 10
        System.out.println(t.ceilingKey(10));
    }
}