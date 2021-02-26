public class circularFastSolution {
    public static void main(String[] args) {
        int[] petrol=new int[]{50,10,60,100};
        int[] dist=new int[]{30,20,100,10};
        int start=0;
        int cur=0;
        int prev=0;
        for(int i=0;i<petrol.length;i++)
        {
            cur+=(petrol[i]-dist[i]);
            if(cur<0)
            {
              start=i+1;
              prev+=cur;
              cur=0;
            }
        }
        if(cur+prev>=0)
        {
            System.out.println(start+1);
        }
        else
        System.out.print(-1);
    }
}