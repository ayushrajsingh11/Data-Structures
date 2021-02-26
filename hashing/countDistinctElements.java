import java.util.HashSet;

public class countDistinctElements {
    public static void main(String[] args) {
        int[]a=new int[]{15,12,13,12,13,13,18};
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
          h.add(a[i]);
        }
        System.out.println(h.size());

    }
}
