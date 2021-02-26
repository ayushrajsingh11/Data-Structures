import java.util.*;

public class string{
static boolean isSafe(String[] str,int l,int i,int r)
{
    if(l!=0&&str[l-1]=="a"&&str[i]=="b")
     return false;
     if(r==l+1&&str[i]=="a"&&str[i]=="b")
     return false;
     return true;
}
static void permu(String[]str,int l,int r)
{
 if(l==r)
 {
     System.out.print(str+" ");
     return;
 }
 else
 {
     for(int i=l;i<=r;i++)
     {if(isSafe(str,l,i,r))
        {
         swap(str[l],str[i]);
         permu(str,l+1,r);
         swap(str[l],str[i]);
        }
     }
 }

}
static void swap(String a,String b)
{
    String t=a;
    a=b;
    b=t;
}
public static void main(String[] args) {
    String[] str=new String[]{"abc"};
    int  l=0;
    int r=str.length-1;
permu(str,l,r);//logic right bt code wrong

}
}