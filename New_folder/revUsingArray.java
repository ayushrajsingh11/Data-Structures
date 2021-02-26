package New_folder;
import java.util.*;
import java.io.*;
class Node8{
    Node next;
    int data;
    Node8(int d)
    {
        data=d;
    }
}
class Rev{
Node head;
 void add(int d)
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
void reverse()
{Node cur;
    ArrayList<Integer> a=new ArrayList<Integer>();
    
    if(head!=null)
    {
        for(cur=head;cur!=head;cur=cur.next)
        {
           a.add(cur.data);
        }
        for(cur=head;cur!=head;cur=cur.next)
        {
            cur.data=a.remove(a.size()-1);
        }
        //return head;
    }
   
}
void print()
{
    Node cur=head;
    while(cur!=null)
    {
     System.out.print(cur.data);
     cur=cur.next;
    }
}
}

public class revUsingArray {
  
    public static void main(String[] args) {
        Rev l=new Rev();
       // Node head=null;
         l.add(10);
     l.add(20);
     l.add(30);
     l.add(40);
     l.add(50);
     l.reverse();
     l.print();
    }
}