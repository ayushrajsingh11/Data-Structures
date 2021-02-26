package New_folder;

public class revIterative {
static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
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
   
    Node reverse(Node head)
    {
      Node prev=null;
      Node curr=head;
      Node next=null;
      while(curr!=null)
      {                  //main logic
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;

      }
      head=prev;
      return head;


    }
    void print(Node head)
    {
        
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String[] args) {
       // revIterative list=new revIterative();

        revIterative l=new revIterative();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        head=l.reverse(head);
        l.print(head);
    }
}