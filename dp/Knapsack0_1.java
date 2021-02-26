import java.util.*;
public class Knapsack0_1 {
  
    static int knap(int w,int[]wt,int[]val,int n)
   { int r;
     if(w==0||n==0)return 0;
             

        if(wt[n-1]>w)return knap(w,wt,val,n-1);
        else
             r= Math.max(knap(w,wt,val,n-1),val[n-1]+knap(w-wt[n-1],wt,val,n-1));
      return r;
    }
    public static void main(String[] args) {
        int[]val=new int[]{10,40,30,50,110};
        int[]wt=new int[]{5,4,6,3,11};
        int w=10;
      System.out.print(knap(w,wt,val,4));
    }
}
