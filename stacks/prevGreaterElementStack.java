import java.util.*;
public class prevGreaterElementStack {
    static void prev(int[] a)
    {
        Stack<Integer> s=new Stack<>();
        s.push(a[0]);
        System.out.println(-1);
        for(int i=1;i<a.length;i++)
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
        int[] a=new int[]{20,30,10,5,15};
        prev(a);
    }
}