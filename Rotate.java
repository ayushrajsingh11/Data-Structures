import java.util.*;
//import java.lang.*;
//import java.io.*;
public class Rotate {
    public static void reverse(int[] arr,int start,int d)
    {
        int temp; 
		while (start < d) { 
			temp = arr[start]; 
			arr[start] = arr[d]; 
			arr[d] = temp; 
			start++; 
			d--; 
		} 
        
    }
    public static void p(int[]arr)
    {
         for(int j=arr.length-1;j>=0;j--)
    {
        System.out.print(arr[j]+" ");
    }
    }
    public static void main(String[] args) throws java.lang.Exception
    {
    Scanner f=new Scanner(System.in);
    int n=f.nextInt();

    
    int[] arr=new int[n];  
    for(int i=0;i<n;i++){
        arr[i]=f.nextInt();
    }
    int d=f.nextInt();
    reverse(arr,0,d-1);
     //p(arr);
       reverse(arr, d, n-1);
       // p(arr);
       // puttha
      // reverse(arr, 0, n-1);
    p(arr);
    f.close();
   
}

}