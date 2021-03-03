import java.util.*;

public class subArrayWithGivenSum {
   public static void main(String[] args) {
    int[]a=new int[]{5,8,6,13,3,-1};
    int p=0,f=0;
    int s=22;
    HashSet<Integer>h=new HashSet<>();
    for(int i:a)
    {
        p+=i;
        if(p==s)//corner case handled a={1,2,4,7} p={1,3,4,7} so if p==s then it'll return true
        f=1;
        if(h.contains(p-s))
        {
            f=1;
        }
        else
        h.add(p);
    }
    if(f==1)
    System.out.println("YES found");
    else
    System.out.println("NO");
   } 
}
