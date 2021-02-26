package ques;

public class linkedListImpletation {
 static Node front=null;
 static Node rear=null;
    static class Node{
      int data;
      Node next;
      Node(int d){
        data=d;
      }
  }  
   static void queue(int d){
      Node temp=new Node(d);
         if(rear==null)
         {
           front=rear=temp;
          // System.out.println("The que is FULL");
         }
       
           rear.next=temp;
           rear=temp;
       

   }
   static void Deq()
   {
    if(front==null)
    {
        System.out.println("The que is EMPTY");
       return;
    }
    
        front=front.next;
    if(front==null)
    {
        rear=null;
    }
   }
   static void print(){
       Node cur=front;
     for(cur=front;cur!=null;cur=cur.next)
     {
           System.out.println(cur.data);
           //cur=cur.next;

       }
       
   }
   public static void main(String[] args) {
       queue(1);
       queue(2);
       queue(3);
       print();
       Deq();
       queue(5);
       print();
   }
}