package ques;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversingQueue {
    static Queue<Integer> s=new LinkedList<>();
     static Stack<Integer> s2=new Stack<>();
     static void reverse(){
         while(s.isEmpty()==false)
         {
             s2.push(s.peek());
             s.remove();
         }
         while(s2.isEmpty()==false)
         {
             s.offer(s2.peek());
             s2.pop();
         }
     }
     static void print()
     {System.out.println("The items in the reversed array is::");
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
        s.add(4);
        reverse();
        print();
    }
}