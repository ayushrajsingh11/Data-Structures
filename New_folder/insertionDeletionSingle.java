package New_folder;

public class insertionDeletionSingle {
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
    void insertion(int in)
    {
      Node append=new Node(in);
      append.next=head;
      head=append;
    }
    void AppendAt(int index,int no)
    {
         Node cur=head;
         Node number=new Node(no);
         for(int i=0;i<index-1;i++)
         {
             cur=cur.next;
         }
         number.next=cur.next;
         cur.next=number;


    }
    void deletion(int d)
    {
        Node cur=head;
     for(int i=0;i<d-1;i++)
     {
       cur=cur.next;
     }
     cur.next=cur.next.next;
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
      insertionDeletionSingle l=new insertionDeletionSingle();
      l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.insertion(5);
        //l.AppendAt(0, 50);
         l.deletion(3);
        l.print();
  }  
}