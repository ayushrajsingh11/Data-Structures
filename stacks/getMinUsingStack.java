import java.util.*;
//import java.io.*;
public class getMinUsingStack {
    static void min(Stack s)
    {
    /* Iterator<Integer> it= s.iterator();
     while(it.hasNext())
     {
         System.out.print(it.next()+" ");
     }
     */
          //it is a way to iterate through the stack
          Iterator<Integer> it= s.iterator();
        Stack<Integer> n=new Stack<>();
        while(it.hasNext()){
             
        }
        Iterator<Integer> i= n.iterator();
        int min=1000;
       while(i.hasNext())
       {
           if(n.peek()<min)
           {
               min=n.pop();
           }
           i.next();
        }
         System.out.println(min+" min val");
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(20);
        s.push(10);
        min(s);
        s.push(5);
        min(s);
        s.pop();
        min(s);
        s.pop();
        min(s);//INCOMPLETE
    }
}