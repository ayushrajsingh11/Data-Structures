public class decreaseDeleteBuildHeap {
    static  int[] a;
    static int size;
   static  int cap;
   decreaseDeleteBuildHeap(int c)
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
    static void insert(int x)
    { if(size==cap)return;
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
    static void decrease(int i,int x)
    {
        a[i]=x;
        
        while(a[parent(i)]>a[i]&&i!=0){
swap(a[parent(i)],a[i]);
i=parent(i);
        }

    }
    static void minHeap(int i)
    {int lt=left(i);
        int rt=right(i);
        int pt=i;
       
        if(lt<size&&a[i]>a[lt])
        pt=lt;
        if(rt<size&&a[pt]>a[rt])
        pt=rt;
        if(pt!=i)
        {swap(a[pt], a[i]);minHeap(i);}
    }
    public static void print()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void delete(int i)
    {
        decrease(i, 0);
        ExtractMin();
    }
    public static int ExtractMin()
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
    static void buildHeap(){
        for(int i=(size-2)/2;i>=0;i--)
        {
            minHeap(i);
        }
    }
    public static void main(String[] args) {
        decreaseDeleteBuildHeap m=new decreaseDeleteBuildHeap(500);
        m.insert(10);
        m.insert(20);
        m.insert(40);
        m.insert(80);
        m.insert(100);
        m.insert(70);
        m.print();
       // decrease(3, 5);
      // m.delete(3);
      //buildHeap();
         m.print();

    }
}
