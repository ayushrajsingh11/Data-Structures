package dbly;

public class dbly1 {
    static Node head=null,tail=null;
    static class Node
    {
        int data;
        Node next,prev;
        Node(int d)
        {
            data=d;
            next=prev=null;
        }

    }
    void add(int d)
    {
       Node temp=new Node(d);
       if(head==null)
       {
           head=tail=temp;
           head.prev=null;
           tail.next=null;
       }
       else
       {
           tail.next=temp;
           temp.prev=tail;
           tail=temp;
           tail.next=null;
       }
    }
    void insertBeg(int d)
    {
     Node temp=new Node(d); 
     temp.next=head;
     head.prev=temp;
     head=temp;  
     
    }
    void insertEnd(int d)
    {
        Node temp=new Node(d);
        temp.prev=tail;
        tail.next=temp;
        temp=tail;
    }
    void insertAt(int pos,int d)
    {
        Node temp=new Node(d);
        Node cur=head;
        for(int i=0;i<pos;i++)
        {
            cur=cur.next;
        }
       cur.prev.next=temp;
       temp.prev=cur.prev;
       temp.next=cur;
       cur.prev=temp;

  // System.out.println(cur.data);
    }
    void deleteBeg()
    {
        Node cur=head;
        head=head.next;
       head.prev=null;
        


    }
    void deleteEnd()
    {
        tail=tail.prev;
        tail.next=null;
        

    }
    void deleteAt(int d)
    {
        Node cur=head;
        for(int i=0;i<d-1;i++)
        {
            cur=cur.next;
        }
        cur.prev.next=cur.next;
        cur.prev=cur.prev.next;
       // System.out.println(cur.data);
    }
    void print()
    {
        Node cur=head;
        if(head==null)
        return;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        dbly1 l=new dbly1();
        l.add(10);
        l.add(20);
        l.add(30);l.print();
        l.insertBeg(40);
        l.print();
        l.insertEnd(50);
        l.print();
         l.insertAt(1,100);
         l.print();
         l.deleteBeg();
         l.print();
         l.deleteEnd();
         //l.notify();
         l.print();
         l.deleteAt(2);
         l.print();
         
    }
}