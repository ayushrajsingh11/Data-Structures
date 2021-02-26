import java.util.*;
public class palindronePartioningMCAdP {
     static  int[][]t=new int[6][6];
    
     static int left;
static int right;
    static int solve(String s,int i,int j)
    {
        if(ispalin(s,i,j))
        return 0;
           if  (t[i][j]!=-1)return t[i][j];
        int temp=Integer.MAX_VALUE;

        for(int k=i;k<=j-1;k++)
        {
            if(t[i][j]!=-1)
             left=t[i][j];
            else
            right=solve(s,i,k);
 t[i][j]=right;
            
            if(t[i][j]!=-1)
             left=t[i][j];
            else
 right=solve(s,k+1,j);
 t[i][j]=right;
            
              temp=Math.min(temp,1+left+right);
        }
        return temp;
    }  
    static boolean ispalin(String input, int start, int end) 
	{ 
	    // Using two pointer technique to check pallindrome 
	    while (start < end) { 
	        if (input.charAt(start) != input.charAt(end)) 
	            return false; 
	        start++; 
	        end--; 
	    } //wrong
	    return true; 
    } 
    public static void main(String[] args) {
        // Arrays.fill(t,-1);
       for(int i=0;i<t.length;i++)
       for(int j=0;j<t.length;j++)
       t[i][j]=-1;
        System.out.print(solve("abcd",0,"abcd".length()-1));
    }
}
