import java.util.*;
import java.io.*;
public class chaining {
   static int bucket;
   static ArrayList<LinkedList<Integer>> table; 
    chaining(int b)
    {
       bucket=b;
       table=new ArrayList<LinkedList<Integer>>();
       for(int i=0;i<b;i++)
       {
          table.add(new LinkedList<Integer>());
       }

    }
    static  void insert(Integer k)
    {
       int i=k%bucket;//index
       table.get(i).add(k);

    }
    static boolean search(Integer k)
    {
       int i=k%bucket;
       return table.get(i).contains(k);
    }
    static void delete(Integer k)
    {
       int i=k%bucket;
       table.get(i).remove(k);
    }
    public static void main(String[] args) {
       chaining mh=new chaining(7);
       mh.insert(10);
	    mh.insert(20);
	    mh.insert(15);
       mh.insert(7);
       System.out.println(mh.search(10));
       mh.delete(15);
       System.out.println(mh.search(15));


       HashSet<String> h=new HashSet<>();
       h.add("hello");
       h.add("how r u");
       h.add("welcome");
       System.out.println(h.size());
       for(String s:h)
       {
          System.out.println(s);
       }

       HashMap<String,Integer> m=new HashMap<>();
       m.put("h",1);
       m.put("he",2);
       m.put("hel",3);
       for(Map.Entry<String,Integer>e:m.entrySet())
       {
            System.out.println(e.getKey()+" "+e.getValue());
       }
    }
}
