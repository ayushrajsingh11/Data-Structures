package searching;
public class FindPeakElement {
     public static void main(String[] args) {
         int[] a=new int[]{10,20,15,5,90,60};
         int n=a.length;
         int i;
         if(n==1)
         System.out.println(a[0]);
        if(a[0]>a[1])
         System.out.println(a[0]);
         if(a[n-1]>a[n-2])
         System.out.println(a[n-1]);
         for(i=1;i<n-1;i++)
         {
           if(a[i]>=a[i-1]&&a[i]>=a[i+1])
           {
            System.out.println(a[i]);
            break;
           }
         }

     }
}