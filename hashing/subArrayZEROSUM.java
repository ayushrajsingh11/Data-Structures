import java.util.*;
public class subArrayZEROSUM {
    public static void main(String[] args) {
        int[]a=new int[]{3,1,-2,5,6};
        int p=0,f=0;
        HashSet<Integer>h=new HashSet<>();
        for(int i:a)
        {
            p+=i;
            if(h.contains(p))
            {
                f=1;
            }
            else
            h.add(i);
        }
        if(f==1)
        System.out.println("YES found");
        else
        System.out.println("NO");

    }

}
