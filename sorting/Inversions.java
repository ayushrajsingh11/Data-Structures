package sorting;
//i<j and a[i]>a[j]
import java.util.*;
public class Inversions {
    public static void main(String[] args) {
        int[] a=new int[]{2,4,1,3,5};
       // Arrays.sort(a);
        int n=a.length;
        int i,j,c=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n-1;j++)
            {if(a[i]>a[j])
              c++;
            }
        }
        System.out.println(c);
    }
}