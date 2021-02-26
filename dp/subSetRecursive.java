import java.util.*;
public class subSetRecursive {
    static int subset(int []a,int n,int sum)
    {
        if(n==0)
        return sum==0?1:0;
        return subset(a,n-1,sum)+subset(a, n-1, sum-a[n-1]);
    }
    public static void main(String[] args) {
        int[]a=new int[]{10,20,15};
           System.out.println(subset(a,a.length,25));
    }
}
