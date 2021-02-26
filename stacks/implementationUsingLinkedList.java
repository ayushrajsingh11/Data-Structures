public class implementationUsingLinkedList {
    static Node head;
    static class Node{
        
        int data;
        Node next=null;
        Node(int d){
            data=d;
        }
    }
   static void push(int d)
     {
         Node temp=new Node(d);
         temp.next=head;
         head=temp;

     }
    static void pop()
     {
         if(head==null)
         {
             System.out.println("Lsit is empty");
             return;
         }
         else
         {
             int r=head.data;
             head=head.next;
             System.out.print("The poped item is: "+r);
         }
     }
     static void print()
     {
         Node cur=head;
         while(cur!=null)
         {
             System.out.println(cur.data);
             cur=cur.next;
         }
     }
     public static void main(String[] args) {
         push(1);
         print();
         push(2);
         print();
         push(3);
         push(4);
         print();
         pop();
         pop();
         
     }

}