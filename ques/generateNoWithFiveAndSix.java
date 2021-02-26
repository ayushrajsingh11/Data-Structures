package ques;

import java.util.LinkedList;
import java.util.Queue;

public class generateNoWithFiveAndSix {
    public static void main(String[] args) {
        Queue<String> s=new LinkedList<>();
        s.offer("5");
        s.offer("6");
        for(int count=0;count<10;count++)
        {
            String str=s.peek();
            System.out.println(str+" ");
            s.remove();
            s.offer(str+"5");
            s.offer(str+"6");
        }
        
    }
}