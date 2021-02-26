import java.util.*;
public class optimalStraGamePlaying {
    static int optimal(int[]a,int i,int j)
    {
        if(i+1==j)return Math.max(a[i],a[j]);

        return Math.max(a[i]+Math.min(optimal(a,i+2,j),optimal(a,i+1,j-1)),a[j]+Math.min(optimal(a,i+1,j-1),optimal(a, i, j-2)));
    }
    public static void main(String[] args) {
        int[]a=new int[]{2,3,15,7};
        System.out.print(optimal(a,0,a.length-1));
    }
}
