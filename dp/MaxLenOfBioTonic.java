import java.util.*;
public class MaxLenOfBioTonic  {
    
    static int biotonic(int[]a,int n)
     {
          int[]lis=new int[n];
          lis[0]=1;
          for(int i=1;i<n;i++)
          {lis[i]=1;

              for(int j=0;j<i;j++)
              {
                  if(a[i]>a[j])
                  lis[i]=Math.max(lis[i],lis[j]+1);
              }

          }
        //   Arrays.sort(lis);
        //   return lis[lis.length-1];
        int[]lds=new int[n];
        lds[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {lds[i]=1;
            for(int j=n-1;j>i;j--)
            {if(a[i]>a[j])
             lds[i]=Math.max(lds[i],lds[j]+1);
            }
        }
        int max = lis[0] + lds[0] - 1; 
        for (int i = 1; i < n; i++) 
            if (lis[i] + lds[i] - 1 > max) 
                max = lis[i] + lds[i] - 1; 
  
        
       
        return max; 

    
    }
    public static void main(String[] args) {
        int[]a=new int[]{1,11,2,10,4,5,2,1};
    System.out.print(biotonic(a,a.length));
    }
}