import java.util.*;

class Item implements Comparable<Item>{
    public  int wt;
    public  int val;
      Item(int a,int b)
      {
          wt=a;
          val=b;
      }
    public int compareTo(Item i)
    {
        return wt*i.val-val*i.wt;//nice
    }
}
public class knapstack {
   static double knapsack(Item[] a,int w)
   {Arrays.sort(a);
   double res=0.0;
     int curCap=w;
       for(int i=0;i<a.length;i++)
       {
           if(a[i].wt<=curCap)
           { res+=+a[i].val;
               curCap=curCap-a[i].wt;
              
           }
           else
           {
               res+=a[i].val*((double)curCap/a[i].wt);
               break;
           }
       }
 
        return res;
    }
    public static void main(String[] args) {
        Item a[]={new Item(50,600),new Item(20,500),new Item(30,400)};
        System.out.print(knapsack(a,70));
    }
}
