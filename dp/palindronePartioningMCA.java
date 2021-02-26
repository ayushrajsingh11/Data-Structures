public class palindronePartioningMCA {
    static boolean ispalin(String input, int start, int end) 
	{ 
	    // Using two pointer technique to check pallindrome 
	    while (start < end) { 
	        if (input.charAt(start) != input.charAt(end)) 
	            return false; 
	        start++; 
	        end--; 
	    } 
	    return true; 
	} 
 static int solve(String s,int i,int j)
 {if(i>=j)return 0;
     if(ispalin(s,i,j))
     return 0;
     int temp=Integer.MAX_VALUE;
     for(int k=i;k<=j-1;k++)
     {
           temp=Math.min(temp,1+solve(s,i,k)+solve(s,k+1,j));
     }
     return temp;
 }  
 public static void main(String[] args) {
     System.out.print(solve("nitik",0,"nitik".length()-1));
 } 
}
