import java.util.*;
public class longestCommonSpanSameSumTwoBinaryArrays{
public static void main(String[] args) {
    int[]a1=new int[]{0,1,0,0,0,0};
    int[]a2=new int[]{1,0,1,0,0,1};
    int[]trick=new int[a1.length];
    for(int i=0;i<a1.length;i++)
    {
        trick[i]=a1[i]-a2[i];
    }
    //now longest subsequence with zero sum
    HashMap<Integer,Integer>h=new HashMap<>();
    int max=0; int s=0;
   for(int i=0;i<trick.length;i++)
   {
      
       s+=trick[i];
       if(s==0)
       max=i+1;//corner case for last index;
       if(h.containsKey(s))
       {  
           max=Math.max(max,i-h.get(s));
       }
       else
       h.put(s,i);

   }
   System.out.println(max);
}
}