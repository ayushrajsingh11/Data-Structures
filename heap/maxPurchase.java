import java.util.*;
public class maxPurchase {
    static int max(int[] a,int s)
    {int o=0;
        int sum=0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            if(sum<=s)
            {
                o++;

            }
        }

        return o;
    }
    public static void main(String[] args) {
        int[] a=new int[]{20,10,5,30,100};
        int s=35;
      System.out.println(max(a,s));

    }
}
