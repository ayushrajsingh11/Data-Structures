package New_folder;

public class evenOddSegeration {
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
      void even(Node head)
      {
          Node cur=head;
          Node odd=head;
          for(cur=head;cur!=null;cur=cur.next)
          {
              if(cur.data%2==0)
              {
                  System.out.println(cur.data);
              }
             
          }
          for(odd=head;odd!=null;odd=odd.next)
          {
            if(odd.data%2!=0)
            {
                System.out.println(odd.data);
            } 
          }


      }
    void print()
    {
        Node cur=head;
        while(cur!=null)
        {
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        evenOddSegeration l =new evenOddSegeration();
        l.add(1);
        l.add(2);
       l.add(3);
        l.add(4);
        l.add(5);
        l.even(head);
       // l.print();
    }
}