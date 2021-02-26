package sorting;

import java.util.*;

class C implements Comparator<Integer>
{
    public int compare(Integer a,Integer b)
    {
        return a%2-b%2;
    }
}
public class allEvenAndOdd {
    public static void main(String[] args) {
        Integer[] a={6,4,2,5,3,1,2};
        Arrays.sort(a,new C());
        System.out.print(Arrays.toString(a));
    }
}