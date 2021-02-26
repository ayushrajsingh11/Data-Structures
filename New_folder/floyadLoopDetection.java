package New_folder;

public class floyadLoopDetection {
    static Node head;
    static class Node{
        int key;
        Node next;
        
    }
    static Node newNode(int key) 
    { 
        Node temp = new Node(); 
        temp.key = key; 
        temp.next = null; 
        return temp; 
    } 
    static boolean loop(Node head)
    {
   Node slow=head;
   Node fast=head;
   while(fast!=null&&fast.next!=null)
   {
       slow=slow.next;
       fast=fast.next.next;
       if(slow==fast)
       {return true;}
       
   }
   return false;
    }
    public static void main(String[] args) {
        Node head = newNode(1); 
    head.next = newNode(2); 
    head.next.next = newNode(3); 
    head.next.next.next = newNode(4); 
    head.next.next.next.next = newNode(5); 

    // Create a loop for testing(5 is pointing to 3) / 
    head.next.next.next.next.next = head.next.next; 

    boolean found = loop(head); 
    if (found) 
        System.out.println("Loop Found"); 
    else
        System.out.println("No Loop");
    }
}