package searching;
import java.util.*;
//import java.io.*;
public class BinaryRec {
    public static int fo(int[] arr,int low,int high,int t)
{
        if(low<=high)
        {
        int mid=low+(high-low)/2;
        if(arr[mid]==t)
        return mid;
         if(arr[mid]>t)
        return fo(arr,low,mid-1,t);
        
        return fo(arr,mid+1,high,t);
        }
        return -1;
    }
    
    

public static void main(String[] args)throws java.lang.Exception {
    int[] arr=new int[]{10,20,30,50,40};
    int n=arr.length;
    Scanner f=new Scanner(System.in);
    int t=f.nextInt();
    int low=0;
    int high=n-1;
    Arrays.sort(arr);
    System.out.print(fo(arr,low,high,t));
    f.close();
}


}