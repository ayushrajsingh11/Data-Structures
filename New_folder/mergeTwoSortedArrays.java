package New_folder;

public class mergeTwoSortedArrays {
    static Node head1,head2;
    static class Node  
    {  
        int data;  
        Node next,random;  
        Node(int x)  
        {  
            data = x;  
            next = null;  
        }  
    } 
    static void print(Node head1)
    {
        Node cur=head1;
        while(cur!=null)
        {
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    Node merge(Node a,Node b)
    {Node tail=null;
        Node head=null;
      if(a==null)//corner cases handled
      return b;
      if(b==null)
      return a;
      if(a.data>b.data)
      {
      head=tail=b;
      b=b.next;
      }
      else
      {
      head=tail=a;
      a=a.next;
      }
      while(a!=null&&b!=null)
      {
          if(b.data>a.data)
          {
            tail.next=a;
        tail=a;
        a=a.next;
          }
          else
          {
            tail.next=b;
            tail=b;
            b=b.next;

          }
      }
      if(a!=null)
      {
         tail=a.next;
      }
      else
      tail=b.next;
    return head;
    }
    public static void main(String[] args) {
       
        mergeTwoSortedArrays list =new mergeTwoSortedArrays();
        list.head1 = new Node(10); 
        list.head1.next = new Node(20); 
        list.head1.next.next = new Node(30); 
        list.head2 = new Node(5); 
        list.head2.next = new Node(25); 
        Node head=list.merge(head1,head2);
        print(head);
    }
}