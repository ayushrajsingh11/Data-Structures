package ques;
import java.util.*;
public class implemngStacksUsingQueues {
    static Queue<Integer> s=new LinkedList<Integer>();
    static Queue<Integer> s2=new LinkedList<Integer>();
    static void addd(int d)
    {
     while(s.isEmpty()==false)
     {
    
         s2.add(s.peek());//STEP 1
         s.remove();
     }
     s.add(d);
     while(s2.isEmpty()==false)
     {
         s.add(s2.peek());
         s2.remove();
     }
    }
   
    static void print()
    {
        while(s.isEmpty()==false)
        {
            System.out.print(s.peek()+" ");
            s.remove();
        }
    }
    public static void main(String[] args) {
        
           s.add(1);
           s.add(2);
           s.add(3);
           addd(20);
           s.add(4);
           
           print();

    }
}