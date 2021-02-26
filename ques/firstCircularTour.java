package ques;

public class firstCircularTour {
    public static void main(String[] args) {
        int[] petrol=new int[]{4,8,7,4};
        int[] dist=new int[]{6,5,3,5};
        int cur=0;
        for(int start=0;start<petrol.length;start++)
        {int end=start;
             cur=0;
            while(true)
            {
                cur+=petrol[end]-dist[end];
                if(cur<0)
                {
                    break;
                }
                end=(end+1)%2;
                if(start==end)
                {
                    System.out.println(start+1);
                    break;
                }
               
            }
        }
        System.out.println(cur);
    }
}