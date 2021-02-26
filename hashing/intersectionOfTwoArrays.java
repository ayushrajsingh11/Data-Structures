import java.util.*;
public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        int[]a=new int[]{10,15,20,15,30,30,5};
        int[]b=new int[]{30,5,30,80};
        HashSet<Integer>h=new HashSet<>();
        for(int i:a)
        {
            h.add(i);
        }
        int r=0;
        for(int i:b)
        {
            if(h.contains(i))
            {
                r++;
                h.remove(i);
            }
        }
        System.out.println(" This is m+n solution :"+r);
    }
}
