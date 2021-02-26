import java.util.*;
class Activity{
    int start;
    int end;
    Activity(int a,int b)
    {
        start=a;
        end=b;
    }

}
class m implements Comparator<Activity>{
    public int compare(Activity a,Activity b)
    {
        return (a.end-b.end);
    }    
}
public class activitySelection {
    
    static int selection(Activity a[])
    {
         
       // Comparator m;
        Arrays.sort(a, new m());
        int prev=0;int res=1;
        for(int i=1;i<a.length;i++)
    {
        if(a[i].start>=a[prev].end)
        {
            prev=i;
            res++;
        }
    }
     return res;   
    }
   
    
    public static void main(String[] args) {
        Activity a[]={
           ( new Activity(12,25)),
            new Activity(10, 20),
            new Activity(20,30)

        };
        System.out.print(selection(a));
    }
}
