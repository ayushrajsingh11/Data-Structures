import java.util.ArrayDeque;
public class arrayDequeAsQueue {

 public static void main(String[] args) {
            // Java program to demonstrate working of
    // ArrayDeque in Java
    
            // Creating empty ArrayDeque
            ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
    
            // Pushing items to the ad using add()
            ad.offer(10);//queue
            ad.offer(20);
            
            // Returns the top of stack, 20
            System.out.println(ad.peek());
            
            // Returns and Removes the top of stack, 20
            System.out.println(ad.remove());
            
            // Returns the top of stack, 10
            System.out.println(ad.peekLast());
            
            // Pushes 40
            ad.offerFirst(40);
            
            // Returns the top of s
        
    }   
}