public class implementaionUsingArrays {
   static int[] arr=new int[5];
  static int size=arr.length;
    static int top=-1;
   static void push(int a)
    {
       if(top==size-1)
       {
           System.out.println("Static is full");
         return;
       }
       else
       {
           top++;
           arr[top]=a;
       }

    }
  static  void pop()
    {
      if(top==-1)
      {
          System.out.println("Statck is empty");
      }
      else
      {
          int r=arr[top];
          top--;
          System.out.println("The poped item is: "+r);
      }
    }
    static void print()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print("Now the array is: "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
       // int[] a=new int[5];
       push(1);
       print();
       push(2);
       print();
       pop();
       print();
       push(4);
       print();
       pop();
       pop();
       print();
       pop();
       print();//we can also implement this using STACK data structure

    }
}