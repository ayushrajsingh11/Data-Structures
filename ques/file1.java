package ques;

public class file1 {
    static int front=-1;
    static int rear=0;
    static int[] a=new int[5];
    static int n=a.length;
       static void enqueue(int d)
       {
           if(rear==n)
           {
               System.out.println("The queue is full");
               return;
           }
           else
           {
               if(front==-1)
               {
                   front=0;
                   a[front]=d;
               }
            // front=0;
             a[rear]=d;
             
             rear++;

           }
       }
       static void deQu(){
        if(front==rear)
        {
            System.out.println("The quu is empty");
            return;
        }
        else
        {
            for(int i=0;i<rear-1;i++)
            {
                a[i]=a[i+1];
            }
            if(rear<n)
            {
                a[rear]=0;
               
            }
           rear--;
        }
       }
       static void print()
       {
           for(int i=front;i<rear;i++)
           {
               System.out.print(a[i]+" ");
           }
       }
    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        //enqueue(3);
        deQu();
        deQu();
        //deQu();
        print();
    }
}