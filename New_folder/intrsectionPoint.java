package New_folder;
import java.util.*;
public class intrsectionPoint {
    static Node head1;
    static Node head2;
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
   void intersection(Node head1,Node head2)
   {
       int c1=0,c2=0;
       Node cur1,cur2;
       for(cur1=head1;cur1!=null;cur1=cur1.next)
       {
           c1++;
       }
       for(cur2=head2;cur2!=null;cur2=cur2.next)
       {
          c2++;

       }
       int d=Math.abs(c1-c2);
       //System.out.print(d);
       cur1=head1;
       cur2=head2;
       if(c1>c2)
       {
       for(int i=0;i<d;i++)
       {
           
        cur1=cur1.next;
       }
       while(cur1!=null&&cur2!=null)
       {
           if(cur1.data==cur2.data)
           {
               System.out.print(cur1.data);
               break;
           }
           cur1=cur1.next;
           cur2=cur2.next;
       }
    }
    else
    {//cur2=head2;
        for(int i=0;i<d;i++)
       { 
           
          cur2=cur2.next;
       }
       while(cur2!=null&&cur1!=null)
       {
           if(cur1.data==cur2.data)
           {
               System.out.print(cur2.data);
               break;
           }
           cur2=cur2.next;
           cur1=cur1.next;

       }
    }



   }
    
    public static void main(String[] args) {
    intrsectionPoint list =new intrsectionPoint();
    list.head1 = new Node(3); 
    list.head1.next = new Node(6); 
    list.head1.next.next = new Node(9); 
    list.head1.next.next.next = new Node(15); 
    list.head1.next.next.next.next = new Node(30); 

    // creating second linked list 
    list.head2 = new Node(10); 
    list.head2.next = new Node(15); 
    list.head2.next.next = new Node(30); 
    list.intersection(head1,head2);
    }
}