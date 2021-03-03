import java.util.*;
public class longestSubArraywithEqualZerosAndOnes {
    public static void main(String[] args) {
        int[]a=new int[]{1,0,1,1,1,0,0};
        //this is a trick ques ,replace 0's with -1 and then observe
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                a[i]=-1;
            }
        }
        Map<Integer,Integer>h=new HashMap<>();
        int p=0,ma=0;
        for(int i=0;i<a.length;i++)
        {
            p+=a[i];
            if(p==0)//corner case
             ma=i+1;
            if(h.containsKey(p+a.length)==true)
            {
                if(ma<i-h.get(p+a.length))
                {System.out.println("P: "+h.get(p+a.length)+" i: "+i);
                    System.out.println(i-h.get(p+a.length));
                ma=i-h.get(p+a.length);
                System.out.println("Max value: "+ma);
                }

            }
            else
            h.put(p+a.length, i);
        }      
  System.out.println("Ans"+ma);
    }
}
