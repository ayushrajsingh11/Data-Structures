import java.util.*;
public class pairwiseSum {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 8, 4, 7, 6, 1};
        int len = arr.length;
        int x = 14;
        System.out.println(pair(arr, len, x));
    }
    static String pair(int[]a,int n,int srch)
    {
        HashSet<Integer>h=new HashSet<>();
        for(int i:a)
        {
            if(h.contains(srch-i))
            return "YES";
            h.add(i);
        }
        return "NO";
    }
}
