package New_folder;

public class revrseOfSizeK {
    static Node head;
    static class Node11{
        int data;
        Node next;
        Node11(int d)
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
    public Node rev(Node head,int d)
    {
       Node cur=head;
       Node prev=null;
       Node next=null;
       int c=0;
       while(cur!=null&&c<d)

       {
           next=cur.next;
           cur.next=prev;
           prev=cur;
           cur=next;
           c++;
       }
       if(next!=null)
       {
       Node restHead=rev(next,d);
       head.next=restHead;
       }
       
       return prev;
    }
    void print(Node head)
    {
        Node cur=head;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        revrseOfSizeK l=new revrseOfSizeK();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        head=l.rev(head,2);
        l.print(head);
    }
}