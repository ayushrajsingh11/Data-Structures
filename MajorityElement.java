public class MajorityElement {
    public static void main(String[] args) {
       int[] a=new int[]{8,3,4,8,8};
       int n=a.length;
       int i,j,k;
       
       for(i=0;i<n;i++)
       {int c=1;
           for(j=i+1;j<n;j++)
           {
               if(a[j]==a[i])
               {
                   c++;
               }
              
           }
           if(c>n/2)
           {
            System.out.println(c);
            break;
            
           }
           
           
           
       }
       
    }
}