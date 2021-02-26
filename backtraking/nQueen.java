import java.util.*;
public class nQueen {
    static int n=4;
    
    static boolean solve()
    {
        int board[][] = { { 0, 0, 0, 0 }, 
        { 0, 0, 0, 0 }, 
        { 0, 0, 0, 0 }, 
        { 0, 0, 0, 0 } }; 
        if(rec(board,0)==false)return false;
        else
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(board[i][j]);
                }
            }
            return true;
        }
        
    }
    static boolean rec(int[][] board,int col)
    {
        if(col==n)return true;
        for(int i=0;i<col;i++)
        {
            if(safe(board,i,col))
            {
                board[i][col]=1;
                if(rec(board,col+1)==true)
                {
                    return true;
                }
            }
                board[i][col]=0;
            
        }
        return false;
    }
    static boolean safe(int[][] board,int row,int col)
    {
    for(int i=row, j=col;i>=0&&j>=0;i--,j--)
    {
      if(board[i][j]==1)return false;

    }
    for(int i=row, j=col;i<n&&j>=0;i++,j--)
    {
        if(board[i][j]==1)return false;
    }
    for(int i=0;i<col;i++)
    {
        if(board[row][i]==1)return false;
    }
    return true;
    }
    public static void main(String[] args) {
      

        System.out.print(solve());
    }
}
