package sorting;
//import java.util.*;
//import java.io.*;
public class BucketSort {
    public static void Bucket(int[] a,int n,int bucket)
    {
        int max=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        
    }
    public static void main(String[] args) {
        
        int[] a=new int[]{30,40,10,50,5,12,70};
    int n=a.length;
    int bucket=4;
    Bucket(a,n,bucket);
    }
}