package New_folder;
class Node5{
    int data;
    Node next;
    Node previous;
    Node5(int d)
    {
        data=d;
    }
}
class nth{
    Node head;
    void add(int d)
    {
        Node temp=new Node(d);
        temp.next=head;
        head=temp;
    }
    void end(int n)
    {
      Node cur;
      int c=0;
      if(head==null)
      return;
      
      for(cur=head;cur!=null;cur=cur.next)
      {
c++;
      }
      if(c<n)
      return;
      cur=head;
      
      for(int i=0;i<n-1;i++)
      {
          cur=cur.next;
      }
      System.out.println(cur.data);
    
    }
}
public class nthNodeFromEnd {
 public static void main(String[] args) {
     nth l=new nth();
     l.add(10);
     l.add(20);
     l.add(30);
     l.add(40);
     l.add(50);
     l.end(1);
 }  
}