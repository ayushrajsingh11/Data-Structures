public class histogramMaxArea {
    static void histogram(int[] a){
     int n=a.length;
     int r=0;
     for(int i=0;i<n;i++)
    {int cur=0;
        for(int j=i-1;j>=0;j--)//for left side
        {
        if(a[j]>=a[i])
        {
           cur+=a[i];
        }
else
{
break;
}
        }
        for(int j=i+1;j<n;j++)
        {
            if(a[j]>a[i])
            {
                cur+=a[i];
            }
            else
            {
            break;
            }
        }
        r=Math.max(cur,r);

       // System.out.println(cur);
                                     
    }
    System.out.println(r);//On2
    }
    public static void main(String[] args) {
        int[] a=new int[]{6,2,5,4,1,5,6};
        histogram(a);
    }
}