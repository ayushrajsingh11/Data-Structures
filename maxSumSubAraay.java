//import java.util.*;
public class maxSumSubAraay {
  public static void main(String[] args) {
    int[] a=new int[]{2,3,-8,7,-1,2,3};
    int i,j;
    int n=a.length;
    int r=a[0];
    for(i=0;i<n;i++)
    {  int c=0;
        for(j=i;j<n;j++)
        {
            c=c+a[j];
      r=Math.max(r,c);
        }
      
    }
    System.out.println(r);

  }
}