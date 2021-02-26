import java.util.*;
public class implHeap{
   static  int[] a;
    static int size;
   static  int cap;
    implHeap(int c)
    {
        a=new int[c];
        size=0;
        cap=c;
    }
    static int left(int i)
    {return 2*i+1;}
    static int right(int i)
    {return 2*i+2;}
    static int parent(int i)
    {
        return (i-1)/2;
    }
    public void insert(int x)
    {
       
        if(size==cap)return;
        size++;
        a[size-1]=x;
        for(int j=size-1;j!=0&&a[parent(j)]>a[j];)
        {
            
               swap(a[parent(j)],a[j]); 
            j=parent(j);

            
        }

    }
    static void swap(int x,int y){
        int t=a[x];
        a[x]=a[y];
        a[y]=t;
    }
    public void print()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public void minHeap(int i)
    { 
        int lt=left(i);//IT WILL RETURN INDEX
        int rt=right(i);
        int pt=i;
        if(lt<size&&a[lt]<a[i])//checking ki left node khali toh nai
        {
          pt=lt;
        }
     if(rt<size&&a[rt]<a[pt])
     {
         pt=rt;
     }
     if(pt!=i)
     {
         swap(a[pt],i);
         minHeap(i);
     }
    }
    public int ExtractMin()
    {
        if(size==0)return Integer.MAX_VALUE;
        if(size==1){
            size--;
            return a[0];
        }
        swap(a[0],a[size-1]);
        size--;
        minHeap(0);
        return a[size];
        
    }
    public static void main(String[] args) {
  // print();
  implHeap m=new implHeap(1000);
   m.insert(20);
   m.insert(25);
   m.insert(30);
   m.insert(35);
   m.insert(40);
   m.insert(80);
   m.insert(32);
   m.insert(100);
   m.insert(70);
   m.insert(60);
 // System.out.print("The extracted value::"+ m.ExtractMin());
 System.out.print("The old values are:: ");
 m.print();
m.ExtractMin();
System.out.println("The new values are:: ");
 m.print();      

    }
}