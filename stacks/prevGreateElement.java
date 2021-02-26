public class prevGreateElement {
    public static void main(String[] args) {
        int[] a=new int[]{15,10,18,12,4,6,2,8};
        int min=-1;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
             if(a[i]>a[j])
             {
                 min=-1;
             }
             else
             {
                 min=a[j];
                 break;
             }
            }
            System.out.print(min+" ");
        }
    }
}