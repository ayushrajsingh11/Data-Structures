public class linkedList {
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
        static void add(int d)
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
        static void insertFront(int d)
        { Node temp=new Node(d);
           
           
            temp.next=head;
            //head=temp;
            head.prev=temp;
            head=temp;

        }
       static void insertRear(int d)
       {
        Node temp=new Node(d);
        tail.next=temp;
        temp.prev=tail;
        tail=temp;
       } 
       static void deleteRear()
       {
           tail=tail.prev;
           tail.next=null;
       }
       static void deleteFront()
       {
             head=head.next;
             head.prev=null;
       }
       static void print()
       {
           Node cur=head;
           if(head==null)
           return;
           for(cur=head;cur!=null;cur=cur.next)
       {
           System.out.print(cur.data+" ");
       }
       System.out.println();
       }
       public static void main(String[] args) {
           add(1);
           add(2);
           add(3);
           insertFront(4);
           insertFront(5);
           insertRear(6);
           insertRear(7);

           print();
           deleteFront();

           print();
           deleteFront();
           print();
           deleteRear();
           print();
       }
    }
