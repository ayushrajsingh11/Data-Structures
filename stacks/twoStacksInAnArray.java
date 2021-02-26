import java.util.*;
public class twoStacksInAnArray {
   static int[] a=new int[6];
    static int n=a.length;
    static int top=-1;
    static int top2=n;
    static void push1(int d)
    {
       if(top==n)
       {
           System.out.println("stack is full");
           return;
       }
       else
       {
           top++;
           a[top]=d;
       }
   
    }
   static void push2(int d)
    {
       if(top2-1<top)
       {
           System.out.println("Stack2 is full");
           return;
       }
       else
       {
top2--;
a[top2]=d;
       }
    }
   static void pop1()
    {
if(top>=0)
{
    int x=a[top];
    top--;
    System.out.println("The poped item is:"+x);
}
else
{
    System.out.println("Stack is empty");
    return;
}
    }
   static void pop2()
    {
      if(top2<n)
      {
       int x=a[top2];
        top2++;
          System.out.println("The poped ITem from stack2 is::"+x);
     }
    else
    {
    System.out.println("The stack2 is empty");
    return;
    }
}
    public static void main(String[] args) {
        push1(1);
        pop1();
        push2(2);
        pop2();
        pop1();
        push2(2);
        push2(3);
        pop2();

    }
}