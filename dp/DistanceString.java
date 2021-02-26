import java.util.*;
public class DistanceString{
    static int f(String s1,String s2,int m,int n)
    {
        if(m==0)return n;
        if(n==0)return m;
        if(s1.charAt(m-1)==s2.charAt(n-1))return f(s1,s2,m-1,n-1);
        else
        return 1+Math.min(f(s1,s2,m,n-1),Math.min(f(s1,s2,m-1,n),f(s1,s2,m-1,n-1)));
    }
public static void main(String[] args) {
    String s1="aac";
    String s2="abac";
    int m=s1.length();
    int n=s2.length();
    System.out.print(f(s1,s2,m,n));
}
}
