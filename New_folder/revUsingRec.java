package New_folder;

public class revUsingRec {
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
     Node revers(Node head)
    {
        //Node first=head;
        
        if(head==null||head.next==null)
        return head;
        Node RestHead=revers(head.next);
        Node restTail=head.next;
        restTail.next=head;
        head.next=null;
        return RestHead;
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
        revUsingRec l=new revUsingRec();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.revers(head);
        l.print();

    }
}