import java.util.*;
public class coins{
    public static void main(String[] args) {
        int[]coins=new int[]{5,10,2,1};
        int amt=57;int res=0;
        Arrays.sort(coins);
        for(int i=coins.length-1;i>0;i--)
        {
              if(amt>=coins[i])
              {
                  int cur=(int)Math.floor((double)(amt/coins[i]));
                  
                 res=res+cur;
                 amt=amt-cur*coins[i];
              }
             
        }
        if(amt==0)
        {
          System.out.println(res);
        
        }
       
    }
}