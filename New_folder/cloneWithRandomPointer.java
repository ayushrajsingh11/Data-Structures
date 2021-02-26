package New_folder;

public class cloneWithRandomPointer {
    static class Node  
{  
    int data;  
    Node next,random;  
    Node(int x)  
    {  
        data = x;  
        next = random = null;  
    }  
} 
static Node clone(Node start)  
{ 
    Node cur;
    Node temp=null;
    for(cur=start;cur!=null;)
    {
        temp=cur.next;//getting hold of the next item
        cur.next=new Node(cur.data);
        cur.next.next=temp;
        cur=temp;

    }
    cur=start;
    for(cur=start;cur!=null;cur=cur.next.next)
    {
       cur.next.random=(cur.random!=null)?cur.random.next:null;
    }
    Node org=start,copy=start.next;
    temp=copy;//saved the start of the copied linked  list
    while(org!=null&&copy!=null)
    {
        org.next=(org.next!=null)?org.next.next:null;
        copy.next=(copy.next!=null)?copy.next.next:null;
        org=org.next;
        copy=copy.next;

    }
    return temp;


}
static void print(Node start)
    {
        Node cur=start;
        while(cur!=null)
        {
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
  
    public static void main(String[] args) {
        
    Node start = new Node(1);  
    start.next = new Node(2);  
    start.next.next = new Node(3);  
    start.next.next.next = new Node(4);  
    start.next.next.next.next = new Node(5);  
  
    // 1's random points to 3  
    start.random = start.next.next;  
  
    // 2's random points to 1  
    start.next.random = start;  
  
    // 3's and 4's random points to 5  
    start.next.next.random = start.next.next.next.next;  
    start.next.next.next.random = start.next.next.next.next;  
  
    // 5's random points to 2  
    start.next.next.next.next.random = start.next; 
    start=clone(start);
    print(start);
    }
}