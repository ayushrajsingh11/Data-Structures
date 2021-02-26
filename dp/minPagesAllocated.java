import java.util.*;
public class minPagesAllocated {
    static int solve(int[]a,int n,int start,int end,int k)
    {
        if(k>n)
        return 0;
        int res=-1;
        while(start<=end)
        {
            int mid=start +((end-start)/2);
            if(valid(a,n,k,mid))
            {
res=mid;
end=mid-1;
            }
            else
            start=mid+1;
        }
        return res;
    }
    static boolean valid(int[]a,int n,int k,int mid)
    {
        int student=1;
        int sum=0;
        for(int i:a)
        {
            sum+=i;
            if(sum>mid)
            {
                student++;
                sum=i;
            }
        }
        if(student>k)
        return false;
        return true;
    }//bhhht pyara ques hai ye
    public static void main(String[] args) {
        int[]a=new int[]{10,5,30,1,2,5,10,10};
        int n=a.length;
        int s=0;
        Arrays.sort(a);
        // for(int i:a)
        // System.out.println(i);
        int start=a[a.length-1];
        for(int i:a)
        s=s+i;
        int end=s;
        System.out.println(solve(a, n, start, end, 3));
    }

}
