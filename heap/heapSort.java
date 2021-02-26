public class heapSort {
    static  int[] a;
    static int size;
   static  int cap;
   heapSort(int c)
    {
        a=new int[c];
        size=0;
        cap=c;
    }
    static void maxheap(int[] a,int n,int i)
    {
       int left=2*i+1;
       int right=2*i+2;
       int parent=(i-1)/2;
     if(left!=n&&a[left]>a[parent])
     parent=left;
     if(a[right]!=n&&a[right]>a[parent])
     parent=right;
     if(parent!=i)
     {swap(a[parent],a[i]);maxheap(a,n,i);}
    }
    static void swap(int x,int y){
        int t=a[x];
        a[x]=a[y];
        a[y]=t;
    }
    static void heapSort(int[] a,int n){
        buildHeap(a, n);
     for(int i=n-1;i>=0;i--){
         swap(a[0],a[i]);
         maxheap(a, i, 0);
     }
    }
    static void buildHeap(int[] a,int n){
        for(int i=(n-2)/2;i>=0;i--)
        {
            maxheap(a,n,i);
        }
    }
    public static void print()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a=new int[]{10,15,50,4,20};
        int n=a.length;
        print();
        maxheap(a,n,0);
        heapSort(a,n);
        print();
    }
}
