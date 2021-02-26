package New_folder;
class Node7{
    int data;
    Node next;
    Node7(int d)
    {
     data=d;
    }
}
class fina{
Node head;
void push(int d)
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
    void printNthFromLast(int d)
    {if(head!=null)
        {
        Node fast=head;
       for(int i=0;i<d;i++)
        {
            fast=fast.next;
        }
        Node slow=head;
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        System.out.print(slow.data);
    }
    }
    
/*void print(){
    Node cur=head;
    while(cur!=null)
    {
     System.out.print(cur.data);
     cur=cur.next;
    }
   
}
*/
}
public class TwopointerNthNodeFrom_End{
public static void main(String[] args) 
{ 
    fina llist = new fina();
    llist.push(10); 
    llist.push(20); 
    llist.push(30); 
    llist.push(40); 
    llist.push(50);
   llist.printNthFromLast(2);
   // llist.print(); 
} 
}