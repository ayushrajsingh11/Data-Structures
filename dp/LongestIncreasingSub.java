import java.util.*;
public class LongestIncreasingSub{
    public static void main(String[] args) {
        int[]a=new int[]{8,100,150,10,12,14,110};int c=1;
        for(int i=0;i<a.length-1;i++)
        {
                 if(a[i+1]>a[i])
                 c++;
        }
        System.out.print(c);
    }
}