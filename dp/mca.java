public class mca {
   // static int ans=0;
    static int solve(int[]a,int i,int j)
    {
        if(i>=j)return 0;
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
          int temp=solve(a,i,k)+solve(a, k+1, j)+a[i-1]*a[k]*a[j];
         
          if(temp<ans)
          {
          ans=temp;
          }
            
        }
        return ans;   
     }
    public static void main(String[] args) {
        int[]a=new int[]{40,20,30,10,30};
        System.out.print(solve(a, 1, a.length-1));
    }
}
