package New_folder;
class Node3{
    int data;
    Node next;
    Node3(int d)
    {
        data=d;
    }
}
class Middle{
    Node head;
    public void add(int d)
    {
        Node temp=new Node(d);
       
        temp.next=head;
        head=temp;
    }
    public void printMid()
    {
        
        if(head==null)
        return;
        
        int count=0;
        Node cur;
        
        for(cur=head;cur!=null;cur=cur.next)
        {
            count++;
        }
        cur=head;
        for(int i=0;i<count/2;i++)
        {
            cur=cur.next;
        }
        System.out.println(cur.data);
    

    }
}
public class middleOfList {
    public static void main(String[] args) {
      Middle l=new Middle();
      l.add(1);
      l.add(2);
      l.add(3);
      l.add(4);
      l.add(5);
      l.printMid();  
    }
}