package New_folder;

//import java.util.*;
//import java.io.*;
class Node{
    int data;
    Node next;
    Node(int d)
    {
     data=d;
    }
}
class end{
    Node head;
    public void E(int d)
    {
        Node temp=new Node(d);
        if(head==null)
        {
            head=temp;
            return;
        }
        Node cur=head;
        while(cur.next!=null)
        {
                cur=cur.next;

        }
        cur.next=temp;

    }
   public void print()
   {
    Node cur=head;
    while(cur!=null)
    {
     System.out.print(cur.data);
     cur=cur.next;
    }
   } 
}
public class kk {
    
    public static void main(String[] args) {
       end l=new end(); 
        l.E(5);
        l.E(10);
        l.E(20);
        l.print();
    }
}
/*   
Node main_ptr = head; 
if(head!=null)
{
    int count = 0; 
    for(int i=0;i<n;i++)
    main_ptr=main_ptr.next;
    Node ref_ptr = head; 
         { 
            main_ptr = main_ptr.next; 
            ref_ptr = ref_ptr.next; 
        } 
        System.out.println("Node no. " + n + " from last is " + ref_ptr.data); 
        
}
*/