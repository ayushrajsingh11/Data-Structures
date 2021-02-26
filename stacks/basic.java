import java.util.*;
public class basic {
    public static void main(String[] args) {
        ArrayDeque<Integer> a=new ArrayDeque<>();
       a.push(1);//o(1) they are dynamically sized
       a.push(2);
       a.push(3);
       a.push(4);
       System.out.println(a.pop());
    }

    
}