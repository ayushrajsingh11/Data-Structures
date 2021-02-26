public class FlipConsecFlip {
    public static void main(String[] args) {
        int[] a=new int[]{0,0,1,1,0,0,1,1,0,1};
        int n=a.length;
        int i;
        for(i=1;i<n;i++)
        {
            if(a[i-1]!=a[i])
            {
                if(a[i]!=a[0])
                {
                    System.out.println("from "+i+" to");
                }
                else{
                    System.out.println(i-1+" end ");
                }
            }
            if(a[n-1]!=a[0])
            {
                System.out.println(n-1+" end ");
            }
        }
    }
}