package New_folder;

public class DetectLoopWithTempNode {
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
        Node temp=new Node();
        Node cur=head;
        while(cur!=null)
        {
            if(cur.next==null)
            {
                return false;
            }
            if(cur.next==temp)
            {
                return true;
            }
            Node agla=cur.next;
            cur.next=temp;
            cur=agla;
             
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