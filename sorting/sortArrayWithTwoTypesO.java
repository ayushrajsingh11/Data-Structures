package sorting;

public class sortArrayWithTwoTypesO {
    public static void main(String[] args) {
        int[] a=new int[]{0,1,2,1,1,2};
        int l=0;
        int n=a.length;
        int h=n-1;
        int mid=0;
        while(mid<=h)
        {
            switch(a[mid])
            {
                case 0:int t;
                t=a[l];
                a[l]=a[mid];
                a[mid]=t;
                l++;
                mid++;
                break;
                case 1:
                mid++;
                break;
                case 2:
                int k;
                k=a[mid];
                a[mid]=a[h];
                a[h]=k;
                h--;
                break;

               

            }
        
        }
      for(int u=0;u<a.length;u++)
      {
          System.out.println(a[u]);   //o(1) auxilary space
      }
    }
}