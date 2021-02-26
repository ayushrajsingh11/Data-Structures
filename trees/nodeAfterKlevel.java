public class nodeAfterKlevel {
    static class Node{
        int data;
        Node left;Node right;
        Node(int d)
        {
        data=d;
        }
      }
      static void kLevel(Node root,int k)
      {
          if(root==null)
          return;
          if(k==0)
          System.out.println(root.data+" ");
          else
          {
              kLevel(root.left,k-1);
              kLevel(root.right,k-1);
          }
      }
    public static void main(String[] args) {
        Node root=new Node(1);                            //          1
        root.left=new Node(2);                            //     2         5
        root.left.left=new Node(90);                       //  3    4     6    7
        root.left.right=new Node(4);                      
        root.right=new Node(5);                           //inorder-> 3,2,4,1,6,5,7
        root.right.left=new Node(6);
        root.right.right=new Node(80);
        kLevel(root,2);
    }
}