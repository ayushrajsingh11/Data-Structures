import java.util.*;
public class NextGreaterElement {
    static void prev(int[] a)
    {
        Stack<Integer> s=new Stack<>();
        s.push(a[a.length-1]);
        System.out.println(-1);
        for(int i=a.length-2;i>=0;i--)
        {
            while(s.isEmpty()==false&&s.peek()<=a[i])
            {
                s.pop();
            }
            int p=(s.isEmpty())?-1:s.peek();
            System.out.println(p);
            s.push(a[i]);
        }
    }
    public static void main(String[] args) {
       int[] a=new int[]{5,15,10,8,6,12,9,18};
       prev(a);
    }
}