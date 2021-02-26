package New_folder;
class Node4{
    int data;
    Node next;
    Node4(int d)
    {
        data=d;
    }
}
class fast{
    Node head;
    public void add(int d)
    {
        Node temp=new Node(d);
       
        temp.next=head;
        head=temp;
    }
    void printMiddle() 
    { 
        Node slow_ptr = head; 
        Node fast_ptr = head; 
        if (head == null) 
        return;
            while (fast_ptr != null&& fast_ptr.next != null) 
            { 
                fast_ptr = fast_ptr.next.next; 
                slow_ptr = slow_ptr.next; 
            } 
            System.out.println("The middle element is [" + 
                                slow_ptr.data + "] \n"); 
        
    } 
}
public class middleFastSlow {
  public static void main(String[] args) {
    fast llist = new fast(); 
   
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4); llist.add(5);


       // llist.printList(); 
        llist.printMiddle(); 
     
  }  
}