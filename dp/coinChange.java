public class coinChange{
   static int res=0;
    static int coin(int[] a,int n,int sum)
    {
if(sum==0)return 1;
if(n==0)return 0;
res=coin(a,n-1,sum);
if(a[n-1]<=sum)
return res+coin(a,n,sum-a[n-1]);
return res;
    }
    public static void main(String[] args) {
     int[]a=new int[]{2,5,3,6};
     System.out.print(coin(a,a.length,10));   
    }
}
//space optimization version also exists 
//using a one d array using dp solution