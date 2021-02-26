import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class frequencyOfArrayElements {
    public static void main(String[] args) {
        int[]a=new int[]{10,12,15,10,20,12,12};
    LinkedHashMap<Integer,Integer>h=new LinkedHashMap<>();
        for(int i=0;i<a.length;i++)
        {
            h.put(a[i], h.getOrDefault(a[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> e:h.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue() );
        }
    }
}
