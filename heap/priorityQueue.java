import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        q.add(10);
        q.add(20);
        q.add(30);
        for(Integer i:q)
        System.out.print(i+" ");
    }
}
