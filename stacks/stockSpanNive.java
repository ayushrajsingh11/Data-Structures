public class stockSpanNive {
    public static void main(String[] args) {
        int[] a=new int[]{15,13,12,14,16,8,6,4,10,30};
        for(int i=0;i<a.length;i++)
        {int s=1;
            for(int j=i-1;j>=0;j--)
            {
                if(a[i]>=a[j])
                {
                    s++;
                }
                else
                break;
            }
            System.out.print(s+" ");
        }
    }
}