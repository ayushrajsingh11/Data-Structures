package sorting;

public class CommonValuesOfArray {
    public static void merge(int[] a,int[] b,int n,int m)
    {int i=0,j=0;
      while(i<n&&j<m)
      {
          if(a[i]==a[i+1]&&b[j]==b[j+1])
          {
              continue;
          }
          if(a[i]>a[j])
          {
              j++;
          }
          else if(a[i]<b[j])
          {
              i++;
          }
          else
          {
            System.out.println(a[i]);  
          i++;
          j++;
          }

      }
    }
    public static void main(String[] args) {
        int[] a=new int[]{10,15,20,10,10,30,15};
        int[] b=new int[]{5,10,15,20,25,30};
       int n=a.length;
       int m=b.length;
       merge(a,b,n,m);
      
    }
}